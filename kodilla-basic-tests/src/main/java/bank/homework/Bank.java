package bank.homework;

public class Bank {

    private  String cashMashine;
    private  int cashDeposits=15;
    private int cashWithdrawals=25;

    String[] cashMashine=new String[]{"bankomat1","bankomat2","bankomat3", "bankomat4", "bankomat5"};

    int numberOfelements=cashMashine.length();

    public int sum(){
        int suma=0;
        for(int i=0;i<numberOfelements;i++){
            suma = suma + cashMashine[i];
        }
    }

    public int cashMashinesBilnas() {
        return cashDeposits-cashWithdrawals;
    }

    public int amountOfwithdrawalTransaction(){
        return cashWithdrawals;
    }
    public int amountOfdepositTransaction() {
        return cashDeposits;
    }
    public double averageWithdrawalTransactions() {
            return cashWithdrawals / cashMashine.length();
    }
    public double averageDepositTransactions(){
        return cashDeposits/cashMashine.length();
    }


}



