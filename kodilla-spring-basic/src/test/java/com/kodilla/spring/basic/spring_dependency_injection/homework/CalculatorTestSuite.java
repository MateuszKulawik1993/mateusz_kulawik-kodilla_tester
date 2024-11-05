package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testAdd() {
        double result = calculator.add(5, 3);
        Assertions.assertEquals(8, result, 0.01);
    }

    @Test
    public void testSubtract() {
        double result = calculator.subtract(10, 4);
        Assertions.assertEquals(6, result, 0.01);
    }

    @Test
    public void testMultiply() {
        double result = calculator.multiply(2, 3);
        Assertions.assertEquals(6, result, 0.01);
    }

    @Test
    public void testDivide() {
        double result = calculator.divide(10, 2);
        Assertions.assertEquals(5, result, 0.01);
    }

    @Test
    public void testDivideByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}
