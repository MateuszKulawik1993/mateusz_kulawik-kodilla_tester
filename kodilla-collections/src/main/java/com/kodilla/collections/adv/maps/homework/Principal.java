package com.kodilla.collections.adv.maps.homework;

public class Principal {

    private final String name;

    public Principal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dyrektor: " + name;
    }
}
