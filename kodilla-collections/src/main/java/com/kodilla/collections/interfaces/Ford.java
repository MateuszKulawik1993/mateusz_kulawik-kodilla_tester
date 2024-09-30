package com.kodilla.collections.interfaces;

import com.kodilla.Car;

public class Ford implements Car {

     private int speed = 0;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 20;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 10;
        if (speed < 0) speed = 0;
    }

}
