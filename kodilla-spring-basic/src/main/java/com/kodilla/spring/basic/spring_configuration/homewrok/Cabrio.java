package com.kodilla.spring.basic.spring_configuration.homewrok;

import java.time.LocalTime;

public class Cabrio implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalTime currentTime = LocalTime.now();
        return currentTime.isAfter(LocalTime.of(20, 0)) || currentTime.isBefore(LocalTime.of(6, 0));
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}