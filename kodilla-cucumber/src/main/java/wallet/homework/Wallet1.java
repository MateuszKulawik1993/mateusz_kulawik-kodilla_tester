package wallet.homework;

public class Wallet1 {

        private int balance;
        private int dispensedAmount;

    public Wallet1(int initialBalance) {
        this.balance = initialBalance;
        this.dispensedAmount = 0;
    }

        public int getBalance() {
        return balance;
    }

        public int getDispensedAmount() {
        return dispensedAmount;
    }

        public String withdraw(int amount) {
        if (amount > balance) {
            dispensedAmount = 0;
            return "Not enough money in the wallet.";
        } else {
            balance -= amount;
            dispensedAmount = amount;
            return "Withdrawal successful.";
        }
    }
}
