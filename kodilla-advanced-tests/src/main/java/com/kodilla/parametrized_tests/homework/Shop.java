package com.kodilla.parametrized_tests.homework;

mport java.time.LocalDate;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    private Set<Order> orders;

    public Shop() {
        orders = new HashSet<>();
    }

    // Dodanie nowego zamówienia
    public void addOrder(Order order) {
        orders.add(order);
    }

    // Zwrócenie listy zamówień z zakresu dwóch dat
    public List<Order> getOrdersByDateRange(LocalDate startDate, LocalDate endDate) {
        return orders.stream()
                .filter(order -> !order.getOrderDate().isBefore(startDate) &&
                        !order.getOrderDate().isAfter(endDate))
                .collect(Collectors.toList());
    }

    // Pobranie zamówień na podstawie zakresu wartości zamówienia
    public List<Order> getOrdersByValueRange(double minValue, double maxValue) {
        return orders.stream()
                .filter(order -> order.getOrderValue() >= minValue &&
                        order.getOrderValue() <= maxValue)
                .collect(Collectors.toList());
    }

    // Zwrócenie liczby zamówień
    public int getOrderCount() {
        return orders.size();
    }

    // Zsumowanie wartości wszystkich zamówień
    public double getTotalOrderValue() {
        return orders.stream()
                .mapToDouble(Order::getOrderValue)
                .sum();
    }
}
