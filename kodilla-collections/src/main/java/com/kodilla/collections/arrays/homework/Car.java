package com.kodilla.collections.arrays.homework;

public class Car {
        private String brand;
        private String model;
        private int speed;

        public Car(String brand, String model, int speed) {
            this.brand = brand;
            this.model = model;
            this.speed = speed;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getSpeed() {
            return speed;
        }

        @Override
        public String toString() {
            return "Marka: " + brand + ", Model: " + model + ", Prędkość: " + speed + " km/h";
        }
}
