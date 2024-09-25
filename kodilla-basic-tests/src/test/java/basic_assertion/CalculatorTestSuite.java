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

    @Test
    public void testPow{
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        double c = 5.0;
        double expected=25;
        double powResult = calculator.pow(c, 2);
        boolean correct2 = ResultChecker.assertEquals(25, powResult, double delta);

        if (correct2) {
            System.out.println("Metoda Math.powResult działa poprawnie dla liczby " + c);
        } else {
            System.out.println("Metoda Math.powResult nie działa poprawnie dla liczb " + c);
        }
        if (correct2>0) {
            System.out.println("Metoda Math.powResult działa poprawnie dla liczby " + c);
        } else {
            System.out.println("Metoda Math.powResult nie działa poprawnie dla liczb " + c);
        }
        if (correct2>=0) {
            System.out.println("Metoda Math.powResult działa poprawnie dla liczby " + c);
        } else {
            System.out.println("Metoda Math.powResult nie działa poprawnie dla liczb " + c);
        }
        if (correct2=<0) {
            System.out.println("Metoda Math.powResult działa poprawnie dla liczby " + c);
        } else {
            System.out.println("Metoda Math.powResult nie działa poprawnie dla liczb " + c);
        }
    }

}


