package com.kodilla.collections.adv.maps.homework;
import java.util.*;

public class SchoolDirectory {
    public static void main(String[] args) {
        // Tworzenie dyrektorów
        Principal principal1 = new Principal("Jan Kowalski");
        Principal principal2 = new Principal("Anna Nowak");
        Principal principal3 = new Principal("Marek Wiśniewski");

        // Tworzenie szkół z liczbą uczniów w klasach
        School school1 = new School("Szkoła Podstawowa nr 1", Arrays.asList(25, 30, 28, 27));
        School school2 = new School("Szkoła Podstawowa nr 2", Arrays.asList(22, 26, 24));
        School school3 = new School("Szkoła Podstawowa nr 3", Arrays.asList(30, 30, 30, 29, 28));

        // Tworzenie mapy przypisującej szkoły do dyrektorów
        Map<Principal, School> schoolDirectory = new HashMap<>();
        schoolDirectory.put(principal1, school1);
        schoolDirectory.put(principal2, school2);
        schoolDirectory.put(principal3, school3);

        // Wyświetlanie informacji o dyrektorach, szkołach i liczbie uczniów
        for (Map.Entry<Principal, School> entry : schoolDirectory.entrySet()) {
            Principal principal = entry.getKey();
            School school = entry.getValue();
            System.out.println(principal.getName() + " zarządza szkołą \""
                    + school.getName() + "\".");
            System.out.println("Łączna liczba uczniów: " + school.getTotalStudents());
            System.out.println();
        }
    }
}
