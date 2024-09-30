package bank.homework;


    public class Bank {
        private int size;
        private CashMachine[] values;

        public Bank() {
            this.size = 0;
            this.values = new CashMachine[0];
        }

        public void addCashMachine(CashMachine cashMachine) {
            CashMachine[] newValues = new CashMachine[this.size + 1];
            System.arraycopy(values, 0, newValues, 0, values.length);
            newValues[this.size] = cashMachine;
            this.values = newValues;
            this.size++;


            public double getTotalBalance() {
            double totalBalance = 0;
            for (CashMachine) {
                totalBalance += CashMachine.getBalance();
            }
            return totalBalance;
        }

        public int getTotalPayOutTransactions() {
            int totalWithdrawals = 0;
            for (CashMachine cashMachine : values) {
                totalWithdrawals += CashMachine.TotalPayOutTransactions();
            }
            return totalPayOut;
        }


        public int getTotalDepositTransactions() {
            int totalDeposits = 0;
            for (CashMachine cashMachine : values) {
                totalDeposits = CashMachine.getDepositTransactions();
            }
            return totalDeposits;
        }

        // Metoda zwracająca średnią wartość wypłaty
        public double getAverageWithdrawal() {
            double totalPayOut = 0;
            int totalPayOuts = 0;
            for (CashMachine cashMachine : values) {
                totalWithdrawn = CashMachine.getTotalWithdrawn();
                totalWithdrawals = CashMachine.getWithdrawalTransactions();
            }
            return  totalWithdrawn / totalWithdrawals;
        }

        // Metoda zwracająca średnią wartość wpłaty
        public double getAverageDeposit() {
            double totalDeposited = 0;
            int totalDeposits = 0;
            for (CashMachine cashMachine : values) {
                totalDeposited += CashMachine.getTotalDeposited();
                totalDeposits += CashMachine.getDepositTransactions();
            }
            return  totalDeposited / totalDeposits;
        }


    }

}



