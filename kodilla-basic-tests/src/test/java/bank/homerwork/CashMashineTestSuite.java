package bank.homerwork;

import bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMashineTestSuite {
    @Test
    public void testCashMashineZerolength() {
        CashMashine cashMashine = new CashMachine();
        int[] values = cashMashine.getValues();
        assertEquals(0, values.length);
    }
    @Test
    public void testCashMashineZerolength2() {
        CashMashine cashMashine = new CashMachine();
        cashMashine.add(4);
        cashMashine.add(-3);

        int[] values = cashMashine.getValues();
        assertEquals(4, values.length);
        assertEquals(-3, values[0]);
        assertEquals(-2, values[1]);
        assertEquals(3, values[2]);

    }

}


