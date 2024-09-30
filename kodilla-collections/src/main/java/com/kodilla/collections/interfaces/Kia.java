package com.kodilla.collections.interfaces;

import com.kodilla.Car;

public class Kia implements Car {

    private int speed = 0;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 25;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 5;
        if (speed < 0) speed = 0;
    }
}
