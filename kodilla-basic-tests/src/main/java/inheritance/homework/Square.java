package inheritance.homework;

public class Square extends Shape {

    public Square() {
        super(4,4);
    }

    @Override
    public  void getField(){
        System.out.println(a*a);
    }
    @Override
    public  void getCircuit(){
        System.out.println(4*a);
    }



}