package com.kodilla.collections.interfaces;

import com.kodilla.Car;

public class CarRace {

    public static void doRace(Car car) {

        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();

        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println("Final speed: " + car.getSpeed() + " km/h");
    }

    public static void main(String[] args) {

        Car ford = new Ford();
        Car opel = new Opel();
        Car kia = new Kia();

        System.out.println("Race for Ford:");
        doRace(ford);

        System.out.println("Race for Opel:");
        doRace(opel);

        System.out.println("Race for Toyota:");
        doRace(kia);
    }


}
