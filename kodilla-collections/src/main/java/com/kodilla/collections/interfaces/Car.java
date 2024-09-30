package com.kodilla.collections.interfaces;

Klasa CarUtils
Następnie stworzymy klasę CarUtils z metodą describeCar.

        java
Skopiuj kod
public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println(car);
    }
}
Klasa CarsApplication
Oto klasa CarsApplication z metodą drawCar oraz main, w której zrealizujemy wszystkie wymagane działania.

        java
Skopiuj kod
import java.util.Random;

public class CarsApplication {
    private static final String[] brands = {"Toyota", "BMW", "Ford", "Audi", "Mercedes"};
    private static final String[] models = {"Model X", "Model Y", "Model Z", "Model A", "Model B"};

    public static Car drawCar() {
        Random random = new Random();
        String brand = brands[random.nextInt(brands.length)];
        String model = models[random.nextInt(models.length)];
        int speed = random.nextInt(201); // Losowa prędkość od 0 do 200 km/h
        return new Car(brand, model, speed);
    }

    public static void main(String[] args) {
        Random random = new Random();
        int numberOfCars = random.nextInt(15) + 1; // Losowa liczba samochodów od 1 do 15
        Car[] cars = new Car[numberOfCars];

        for (int i = 0; i < numberOfCars; i++) {
            cars[i] = drawCar(); // Wypełniamy tablicę samochodami
        }

        System.out.println("Samochody w tablicy:");
        for (Car car : cars) {
            CarUtils.describeCar(car); // Wyświetlamy informacje o każdym samochodzie
        }
    }
}
