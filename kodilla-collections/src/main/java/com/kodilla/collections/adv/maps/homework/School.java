package com.kodilla.collections.adv.maps.homework;

import school.Student;

import java.util.ArrayList;

public class School {

    private String name;
    private ArrayList<Student> studentsPerClass;

    public School(String name, ArrayList<Student> studentsPerClass) {
        this.name = name;
        this.studentsPerClass = studentsPerClass;
    }
    public void addClass(int numberofStudents) {
        studentsPerClass.add(numberofStudents);
    }

    public int getNumberOfStudents() {
        int total = 0;
        for(Student student : studentsPerClass) {
            total += student;
        }
            return total;
        }

    public String getName(){
        return name;
    }




}
