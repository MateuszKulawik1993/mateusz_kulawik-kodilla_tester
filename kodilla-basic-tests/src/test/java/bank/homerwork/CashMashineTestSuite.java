package bank.homerwork;

import bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMashineTestSuite {
    @Test
    public void testCashMashineZerolength() {
        CashMachine cashMashine = new CashMachine();
        int[] values = cashMashine.getValues();
        assertEquals(0, values.length);
    }
    @Test
    public void testCashMashineZerolength2() {
        CashMachine cashMashine = new CashMachine();
        cashMashine.add(4);
        cashMashine.add(-3);

        int[] values = cashMashine.getValues();
        assertEquals(4, values.length);
        assertEquals(-3, values[0]);
        assertEquals(-2, values[1]);
        assertEquals(3, values[2]);

    }

    @Test
    public void testDepositPositiveValue() {
        CashMachine cashMashine = new CashMachine();
        cashMachine.deposit(100);
        assertArrayEquals(new int[]{100}, cashMachine.getValues());
        assertEquals(1, cashMachine.getTransactionsCount());

        cashMachine.deposit(50);
        assertArrayEquals(new int[]{100, 50}, cashMachine.getValues());
    }

    @Test
    public void testDepositNegativeValue() {
        CashMachine cashMashine = new CashMachine();
        cashMachine.deposit(-100);
        assertArrayEquals(new int[]{}, cashMachine.getValues());
        assertEquals(0, cashMachine.getTransactionsCount());
    }

    @Test
    public void testPayOutNegativeValue() {
        CashMachine cashMashine = new CashMachine();
        cashMachine.payOut(-100);
        assertArrayEquals(new int[]{-100}, cashMachine.getValues());
        assertEquals(1, cashMachine.getTransactionsCount());
    }

    @Test
    public void testPayOutPositiveValue() {
        CashMachine cashMashine = new CashMachine();
        cashMachine.payOut(100);
        assertArrayEquals(new int[]{}, cashMachine.getValues());
        assertEquals(0, cashMachine.getTransactionsCount());
    }



}


