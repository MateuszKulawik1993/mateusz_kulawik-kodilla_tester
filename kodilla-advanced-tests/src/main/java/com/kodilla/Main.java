package com.kodilla;

import com.kodilla.parametrized_tests.homework.Order;
import com.kodilla.parametrized_tests.homework.Shop;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        // Dodanie zamówień
        shop.addOrder(new Order(100.50, LocalDate.of(2024, 10, 22), "user1"));
        shop.addOrder(new Order(200.00, LocalDate.of(2024, 10, 23), "user2"));
        shop.addOrder(new Order(150.00, LocalDate.of(2024, 11, 1), "user3"));

        // 1. Pobranie liczby zamówień
        System.out.println("Liczba zamówień: " + shop.getOrderCount());  // Powinno zwrócić 3

        // 2. Zwrócenie zamówień z zakresu dat
        System.out.println("Zamówienia od 2024-10-01 do 2024-10-31: " +
                shop.getOrdersByDateRange(LocalDate.of(2024, 10, 1), LocalDate.of(2024, 10, 31)));

        // 3. Zamówienia z zakresu wartości
        System.out.println("Zamówienia o wartości od 100 do 200: " +
                shop.getOrdersByValueRange(100.00, 200.00));

        // 4. Suma wartości wszystkich zamówień
        System.out.println("Suma wartości zamówień: " + shop.getTotalOrderValue());  // Powinno zwrócić 450.50
    }
}