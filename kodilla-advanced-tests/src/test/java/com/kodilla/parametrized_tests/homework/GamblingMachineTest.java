package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTest {

    GamblingMachineTest gamblingMachine = new GamblingMachineTest();

    @DisplayName("Test with valid numbers")
    @ParameterizedTest
    @CsvFileSource(resources = "/numbers.csv") // wczytanie danych z pliku numbers.csv
    void shouldReturnWinsForValidNumbers(String input) throws InvalidNumbersException {
        Set<Integer> userNumbers = Arrays.stream(input.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        int wins = gamblingMachine.howManyWins(userNumbers);
        assertTrue(wins >= 0 && wins <= 6, "Number of wins should be between 0 and 6");
    }
    

    @DisplayName("Test invalid size or out-of-range numbers")
    @ParameterizedTest
    @ValueSource(strings = {
            "1,2,3",        // Za mało liczb
            "1,2,3,4,5,50", // Liczba poza zakresem
            "0,2,3,4,5,6",  // Liczba poniżej zakresu
            "1,2,3,4,5,5"   // Powtórzona liczba
    })
    void shouldThrowExceptionForInvalidNumbers(String input) {
        Set<Integer> userNumbers = Arrays.stream(input.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }

    private int howManyWins(Set<Integer> userNumbers) {

        return 0;
    }
}

