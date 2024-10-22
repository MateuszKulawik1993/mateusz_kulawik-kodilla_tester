package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

    public class NumberCheckerTestSuite {
        private NumberChecker numberChecker = new NumberChecker();
        @Test
        public void shouldReturnTrueWhenNumberEqualsThree(){
            boolean result = numberChecker.isDivisibleByThree(3);
            assertTrue(result);
        }
        @Test
        public void shouldReturnTrueWhenNumberIsMultiplyOfThree(){
            boolean result = numberChecker.isDivisibleByThree(12);
            assertTrue(result);
        }
        @Test
        public void shouldReturnTrueWhenNumberEqualsZero(){
            boolean result = numberChecker.isDivisibleByThree(0);
            assertTrue(result);
        }
        @Test
        public void shouldReturnTrueWhenNumberIsANagativeMultipleOfThree(){
            boolean result = numberChecker.isDivisibleByThree(-3);
            assertTrue(result);
        }
        @Test
        public void shouldReturnFalseWhenNumberIsNotDivisibleByThree(){
            boolean result = numberChecker.isDivisibleByThree(2);
            assertFalse(result);
        }
        @ParameterizedTest
        @ValueSource(ints = {0,3,6-3,-12,15})
        public void shouldReturnTrueIfNumberIsDivisibleByThree(int number){
            boolean result = numberChecker.isDivisibleByThree(number);
            assertTrue(result);

        }
        @ParameterizedTest
        @ValueSource(ints = {-2, -1, 1, 2, 4, 5})
        public void shouldReturnFalseForNumberNotDivisibleByThree(int number){
            boolean result = numberChecker.isDivisibleByThree(number);
            assertFalse(result);
        }
    }
}
