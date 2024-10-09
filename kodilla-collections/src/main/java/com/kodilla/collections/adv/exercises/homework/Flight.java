package com.kodilla.collections.adv.exercises.homework;

public class Flight {
    private String departure;
    private String arrival;

    public Flight(String arrival, String departure) {
        this.arrival = arrival;
        this.departure = departure;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public String toString() {
        return "Flight{"+
                "departure='" + departure + '\''+
                ", arrival='" + arrival + '\''+
                '}';
    }
}
