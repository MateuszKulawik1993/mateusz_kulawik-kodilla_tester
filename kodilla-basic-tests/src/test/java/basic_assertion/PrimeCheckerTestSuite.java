package basic_assertion;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTestSuite {
    private PrimeChecker checker = new PrimeChecker();

    @org.junit.jupiter.api.Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber() {
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(14);
        checker.incrementCount();
        System.out.println("Count: " + checker.getCount());;
    }
    @org.junit.jupiter.api.Test
    public void shouldReturnTrueWhenPassingPrimeNumber() {
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(13);
        checker.incrementCount();
        System.out.println("Count: " + checker.getCount());
        assertTrue(result);
    }
     @org.junit.jupiter.api.Test
    public void shouldReturnTrueWhenPassingPrimeNumberAndNotPrimeNumber() {
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(2);
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturnFalseWhenPassingOne() {
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(1);
        assertFalse(result);
    }

     @org.junit.jupiter.api.Test
    public void shouldReturnFalseWhenPassingZero() {
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(0);
        assertFalse(result);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturnFalseWhenPassingNegativeNumber() {
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(-6);
        assertFalse(result);
    }

}
