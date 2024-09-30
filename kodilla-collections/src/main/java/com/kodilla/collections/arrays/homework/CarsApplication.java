package com.kodilla.collections.arrays.homework;

import java.util.Random;

public class CarsApplication {

    private static final String[] brands = {"Toyota", "BMW", "Ford", "Audi", "Mercedes"};
    private static final String[] models = {"Model X", "Model Y", "Model Z", "Model A", "Model B"};

    public static Car drawCar() {
        Random random = new Random();
        String brand = brands[random.nextInt(brands.length)];
        String model = models[random.nextInt(models.length)];
        int speed = random.nextInt(201);
        return new Car(brand, model, speed);
    }

    public static void main(String[] args) {
        Random random = new Random();
        int numberOfCars = random.nextInt(15) + 1;
        Car[] cars = new Car[numberOfCars];

        for (int i = 0; i < numberOfCars; i++) {
            cars[i] = drawCar();
        }

        System.out.println("Samochody w tablicy:");
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }


}
