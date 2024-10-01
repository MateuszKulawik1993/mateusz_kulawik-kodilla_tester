package com.kodilla.collections.lists.homework;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {

        Car ford =new Car;
        Car opel=new Car;
        Car bmw =new Car;

        List<Car> carList =new ArrayList<>();

        carList.add(ford);
        carList.add(opel);
        carList.add(bmw);

        System.out.println("Cars in the list:");
        for (Car car : carList) {
            CarUtils.describeCar(car);
        }
        carList.remove(1);
        System.out.println("After removing second car by index:");

        for (Car car : carList) {
            CarUtils.describeCar(car);
        }

        carList.remove(2);
        System.out.println("After removing third car by index:");
        carList.remove(ford);
        System.out.println("After removing Ford by object:");


        for (Car car : carList) {
            CarUtils.describeCar(car);
        }

        System.out.println("Final size of the car list: " + carList.size());






    }
}
