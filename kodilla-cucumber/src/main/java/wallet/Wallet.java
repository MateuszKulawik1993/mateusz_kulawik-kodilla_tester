package wallet;

public class Wallet {
        private int balance = 0;

        public Wallet(int amount) {
        }

        public void deposit(int money) {
            this.balance += money;
        }

        public int getBalance() {
            return balance;
        }
        public void debit(int money) {
            this.balance -= money;
        }


    public int getDispensedAmount() {
    }

    public String withdraw(int amount) {
    }
}

