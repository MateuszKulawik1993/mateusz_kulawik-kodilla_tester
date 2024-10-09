package com.kodilla.collections.adv.excercises.homework;

import com.kodilla.collections.adv.exercises.homework.Flight;
import com.kodilla.collections.adv.exercises.homework.FlightFinder;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FlightFindersTest {

    private FlightFinder flightFinder = new FlightFinder();

    @Test
    void testFindFlightsfrom() {
        List<Flight> flightsFromWarsaw = flightFinder.findFlightsFrom("Warsaw");
        assertEquals(2, flightsFromWarsaw.size());
        assertTrue(flightsFromWarsaw.contains(new Flight("Warsaw", "New York")));
        assertTrue(flightsFromWarsaw.contains(new Flight("Warsaw", "Berlin")));
    }

    @Test
    void testFindFlightsfrom2() {
        List<Flight>flightsToLosAngeles = flightFinder.findFlightsTo("Los Angeles");
        assertEquals(2, flightsToLosAngeles.size());
        assertTrue(flightsToLosAngeles.contains(new Flight("Warsaw", "Los Angeles")));
        assertTrue(flightsToLosAngeles.contains(new Flight("Berlin", "Los Angeles")));
    }

    @Test
    void testFindFlightsfromNoneExistentCity(){
        List<Flight>flightsFromunKnownCity = flightFinder.findFlightsFrom("Uknown City");
        assertEquals(flightsFromunKnownCity, flightsFromunKnownCity.isEmpty());
    }

    @Test
    void testFindFlightsToNoneExistentCity(){
        List<Flight>flightsTounKnownCity = flightFinder.findFlightsTo("Uknown City");
        assertEquals(flightsTounKnownCity, flightsTounKnownCity.isEmpty());
    }


}
