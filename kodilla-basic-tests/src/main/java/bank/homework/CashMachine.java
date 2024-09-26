package bank.homework;

public class CashMachine {

    public int[] values;
    public int size=0;

    public CashMachine() {
        this.values = new int[0];
        this.size = 0;
    }

    public void add(int value){
        This size;++
        int[] newTab = new int [this.size];
        System.arraycopy(values 0, newTab,0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
    }

    public int[] getValues() {
        return values;
    }

    public int getSaldo(){
        return this.values[0];
    }

    public int getTotal(){
        return this.values[this.size - 1];
    }


}

