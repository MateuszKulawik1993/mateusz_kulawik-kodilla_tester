package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.UserValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;{

private final UserValidator validator = new UserValidator();

@ParameterizedTest
@CsvSource({
        "validUsername, true",
        "valid_user, true",
        "Valid.User-Name, true",
        "sh, false",            // za krótki (mniej niż 3 znaki)
        "inv@lid, false",       // niedozwolony znak '@'
        "validusername123, true",
        "in.valid.name!, false" // niedozwolony znak '!'
})
void shouldValidateUsername(String username, boolean expected) {
    assertEquals(expected, validator.validateUsername(username));
}

@ParameterizedTest
@CsvSource({
        "user@example.com, true",
        "user.name@example.com, true",
        "user-name@domain.co, true",
        "user@sub.domain.org, true",
        "invalid@domain, false",  // brak końcówki TLD
        "@domain.com, false",     // brak nazwy użytkownika
        "user@.com, false",       // brak domeny głównej
        "user@domain.c, true",    // TLD o długości 1
        "user@domain.abcdef, false", // za długie TLD
        "user@domain..com, false"  // podwójna kropka w domenie
})
void shouldValidateEmail(String email, boolean expected) {
    assertEquals(expected, validator.validateEmail(email));
}


