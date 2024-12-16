package com.kodilla.jacoco.spotbugs;

import java.util.Objects;

public class BadCodeExample {
    private String type;

    // Stała liczba Pi
    public static final double PI = Math.PI;

    public static double getPi() {
        return PI;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BadCodeExample that = (BadCodeExample) o;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return "BadCodeExample{" +
                "type='" + type + '\'' +
                '}';
    }
}
