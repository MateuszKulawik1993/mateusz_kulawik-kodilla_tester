package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;

public class FlightRepository {

    public static ArrayList<Flight>getFlightsTable() {
        ArrayList<Flight> flights = new ArrayList<>();

        flights.add("Warsaw", "New York");
        flights.add("Paris", "Los Angeles");
        flights.add("Tokio", "Sydney");
        flights.add("Madrid", "Bogota");
        flights.add("Miami", "Buenos Aires");

        return flights;
    }






}
