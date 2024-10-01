package com.kodilla.collections.sets.homework;

import java.util.HashSet;

public class StampsApplication {
    public static void main(String[] args) {

        HashSet<Stamp> stampCollection = new HashSet<>();


        Stamp stamp1 = new Stamp("Polska 2021", 2.5, 3.0, true);
        Stamp stamp2 = new Stamp("Polska 2021", 2.5, 3.0, true);
        Stamp stamp3 = new Stamp("Francja 2020", 3.0, 4.0, false);


        stampCollection.add(stamp1);
        stampCollection.add(stamp2);
        stampCollection.add(stamp3);


        System.out.println("Kolekcja znaczków:");
        for (Stamp stamp : stampCollection) {
            System.out.println(stamp);
        }


        System.out.println("Liczba znaczków w kolekcji: " + stampCollection.size());
    }

}
