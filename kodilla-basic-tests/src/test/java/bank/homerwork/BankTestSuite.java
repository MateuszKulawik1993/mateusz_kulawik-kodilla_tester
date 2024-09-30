package bank.homerwork;

import bank.homework.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    private Bank bank;
    private CashMachine cashMachine1;
    private CashMachine cashMachine2;

    @BeforeEach
    public void setUp() {
        bank = new Bank();
        cashMachine1 = new CashMachine();
        cashMachine2 = new CashMachine();

        cashMachine1.deposit(200);
        cashMachine1.payOut(-100);

        cashMachine2.deposit(500);
        cashMachine2.payOut(-300);


        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
    }

    @Test
    public void testGetTotalBalance() {
        // Bank powinien mieć saldo 300 (200 - 100 + 500 - 300)
        assertEquals(300.0, bank.getTotalBalance());
    }

    @Test
    public void testGetTotalPayOutTransactions() {
        // Suma wypłat powinna wynosić 2
        assertEquals(2, bank.getTotalPayOutTransactions());
    }

    @Test
    public void testGetTotalDepositTransactions() {
        // Suma wpłat powinna wynosić 2
        assertEquals(2, bank.getTotalDepositTransactions());
    }

    @Test
    public void testGetAverageWithdrawal() {
        // Średnia wypłata powinna wynosić (-100 + -300) / 2 = -200
        assertEquals(-200.0, bank.getAverageWithdrawal());
    }

    @Test
    public void testGetAverageDeposit() {
        // Średnia wpłata powinna wynosić (200 + 500) / 2 = 350
        assertEquals(350.0, bank.getAverageDeposit());
    }

    @Test
    public void testNoWithdrawals() {

        Bank emptyBank = new Bank();
        assertEquals(0, emptyBank.getAverageWithdrawal());
    }

    @Test
    public void testNoDeposits() {

        Bank emptyBank = new Bank();
        assertEquals(0, emptyBank.getAverageDeposit());
    }


}
