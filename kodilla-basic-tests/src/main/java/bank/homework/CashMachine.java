package bank.homework;

public class CashMachine {

    public int[] values;
    public int size=0;

    public CashMachine() {
        this.values = new int[0];
        this.size = 0;
    }

    public void add(int value){
        this.size++;
        int[] newTab = new int [this.size];
        System.arraycopy(values, 0, newTab,0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
    }

    public int[] getValues() {
        return values;
    }

    public double getSaldo(){
     double suma =0;
      for(int i=0; i<this.values.length;i++){
        suma += this.values[i];
      }
      return suma;
    }

    public int getTransactionsCount(){
        return this.values.length;
    }

    public void deposit(int value){
        if (value>0){
            add(value);
        }
    }
    public void payOut(int value){
        if(value<0){
            add(value);
        }
    }
}

