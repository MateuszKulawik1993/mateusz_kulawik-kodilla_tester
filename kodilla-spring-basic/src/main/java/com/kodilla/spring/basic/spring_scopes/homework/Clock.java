package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope("prototype") // Ustawienie scope na "prototype" dla nowego obiektu przy każdym pobraniu beana
public class Clock {

    private LocalTime time;

    public Clock() {
        this.time = LocalTime.now(); // Pobranie aktualnego czasu w momencie tworzenia beana
    }

    public LocalTime getTime() {
        return time;
    }
}
