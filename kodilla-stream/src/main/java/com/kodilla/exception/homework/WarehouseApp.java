package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("456"));
        warehouse.addOrder(new Order("789"));

        try {
            Order order = warehouse.getOrder("456");
            System.out.println("Found order with number: " + order.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println(e.getMessage());
        }

        try {
            Order order = warehouse.getOrder("999");
            System.out.println("Found order with number: " + order.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println(e.getMessage());
        }
    }
}
