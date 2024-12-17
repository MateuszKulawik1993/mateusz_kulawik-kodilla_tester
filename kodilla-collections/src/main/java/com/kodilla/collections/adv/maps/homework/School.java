package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private final String name;
    private final List<Integer> studentsPerClass;

    public School(String name, List<Integer> studentsPerClass) {
        this.name = name;
        this.studentsPerClass = new ArrayList<>(studentsPerClass);
    }

    public String getName() {
        return name;
    }

    public List<Integer> getStudentsPerClass() {
        return new ArrayList<>(studentsPerClass);
    }

    public int getTotalStudents() {
        int total = 0;
        for (int students : studentsPerClass) {
            total += students;
        }
        return total;
    }

    @Override
    public String toString() {
        return "Szkoła: " + name + ", Łączna liczba uczniów: " + getTotalStudents();
    }
}
