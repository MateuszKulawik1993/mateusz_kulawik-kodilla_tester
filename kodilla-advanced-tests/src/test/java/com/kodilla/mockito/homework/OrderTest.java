package com.kodilla.mockito.homework;
import com.kodilla.parametrized_tests.homework.Order;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void testOrderCreation() {
        Order order = new Order(100.50, LocalDate.of(2023, 10, 1), "user123");

        assertEquals(100.50, order.getOrderValue());
        assertEquals(LocalDate.of(2023, 10, 1), order.getOrderDate());
        assertEquals("user123", order.getLogin());
    }

    @Test
    void testEqualsAndHashCode() {
        Order order1 = new Order(150.00, LocalDate.of(2023, 9, 15), "userABC");
        Order order2 = new Order(150.00, LocalDate.of(2023, 9, 15), "userABC");
        Order order3 = new Order(200.00, LocalDate.of(2023, 10, 5), "userXYZ");

        assertEquals(order1, order2);  // Powinny być równe
        assertNotEquals(order1, order3);  // Powinny być różne

        assertEquals(order1.hashCode(), order2.hashCode());  // HashCode powinien być taki sam
        assertNotEquals(order1.hashCode(), order3.hashCode());  // HashCode powinien być różny
    }

    @Test
    void testToString() {
        Order order = new Order(200.00, LocalDate.of(2023, 8, 10), "userXYZ");
        String expected = "Order{orderValue=200.0, orderDate=2023-08-10, login='userXYZ'}";

        assertEquals(expected, order.toString());
    }
}
