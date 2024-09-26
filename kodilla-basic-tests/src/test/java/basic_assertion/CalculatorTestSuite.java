package basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);


        boolean correct1 = ResultChecker.assertEquals(-3, subtractResult);
        if (correct1) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }


    }


}


