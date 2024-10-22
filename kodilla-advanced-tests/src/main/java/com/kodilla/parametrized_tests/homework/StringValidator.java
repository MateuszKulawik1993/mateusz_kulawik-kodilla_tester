package com.kodilla.parametrized_tests.homework;

public class StringValidator {

    public boolean isBlank(String text) {
        return text == null || text.trim().isEmpty();
    }
}
