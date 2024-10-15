package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

      Principal principal1 = new Principal("Jan Kowalski");
      Principal principal2 = new Principal("Grzegorz Brzeczyszczykiweicz");
      Principal principal3 = new Principal("Piotr Gruszka");

        School school1 = new School("Szkoła Podstawowa nr 1");
        School school2 = new School("Szkoła Podstawowa nr 2");
        School school3 = new School("Liceum Ogólnokształcące nr 3");

        school1.addClass(25);
        school1.addClass(30);
        school1.addClass(28);

        school2.addClass(20);
        school2.addClass(22);

        school3.addClass(35);
        school3.addClass(32);
        school3.addClass(27);

        HashMap<Principal, school> schoolDirectory = new HashMap<Principal, school>();

        schoolDirectory.put(principal1, school1);
        schoolDirectory.put(principal2, school2);
        schoolDirectory.put(principal3, school3);

        for(Map.entry(Principal,School) entry : schoolDirectory.entrySet()){
            Principal principal entry.getKay();
            School school entry.getValue();
            System.out.println("Dyrektor: " + principal.getName());
            System.out.println("Szkoła: " + school.getName());
            System.out.println("Łączna liczba uczniów: " + school.getTotalStudents());
            System.out.println("--------------------------------------");
        }





    }
}
