package com.kodilla.mockito.homework;
import com.kodilla.parametrized_tests.homework.Order;
import com.kodilla.parametrized_tests.homework.Shop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    private Shop shop;

    @BeforeEach
    void setUp() {
        shop = new Shop();
        shop.addOrder(new Order(100.0, LocalDate.of(2023, 10, 1), "user1"));
        shop.addOrder(new Order(200.0, LocalDate.of(2023, 10, 5), "user2"));
        shop.addOrder(new Order(300.0, LocalDate.of(2023, 10, 10), "user3"));
    }

    @Test
    void testAddOrder() {
        Order newOrder = new Order(150.0, LocalDate.of(2023, 10, 15), "user4");
        shop.addOrder(newOrder);

        assertEquals(4, shop.getOrderCount());  // Sprawdzenie liczby zamówień
    }

    @Test
    void testGetOrdersByDateRange() {
        List<Order> orders = shop.getOrdersByDateRange(LocalDate.of(2023, 10, 1), LocalDate.of(2023, 10, 5));

        assertEquals(2, orders.size());  // Sprawdzenie liczby zamówień w przedziale dat
        assertEquals(100.0, orders.get(0).getOrderValue());  // Sprawdzenie wartości zamówień
        assertEquals(200.0, orders.get(1).getOrderValue());
    }

    @Test
    void testGetOrdersByValueRange() {
        List<Order> orders = shop.getOrdersByValueRange(150.0, 300.0);

        assertEquals(2, orders.size());  // Sprawdzenie liczby zamówień w przedziale wartości
        assertEquals(200.0, orders.get(0).getOrderValue());
        assertEquals(300.0, orders.get(1).getOrderValue());
    }

    @Test
    void testGetOrderCount() {
        assertEquals(3, shop.getOrderCount());  // Sprawdzenie liczby zamówień
    }

    @Test
    void testGetTotalOrderValue() {
        assertEquals(600.0, shop.getTotalOrderValue(), 0.01);  // Sprawdzenie sumy wartości zamówień
    }
}