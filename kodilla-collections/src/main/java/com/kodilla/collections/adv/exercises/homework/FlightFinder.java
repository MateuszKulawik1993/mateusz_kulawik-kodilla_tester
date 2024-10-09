package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    private List<Flight> flights;
    public FlightFinder() {
        this.flights = FlightRepository.getFlightsTable();

    }

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getDeparture().equals(departure)) {
                flights.add(flight);
            }
        }
            return flights;
    }

    public List<Flight> findFlightsTo(String arrival){
        List<Flight> flights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getArrival().equals(arrival)) {
                flights.add(flight);
            }
        }
        return flights;
    }





}
