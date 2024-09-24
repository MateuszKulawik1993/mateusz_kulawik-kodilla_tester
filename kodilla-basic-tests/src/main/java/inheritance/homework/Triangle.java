package inheritance.homework;


public class Triangle extends Shape {

    int h;

    public Triangle() {
        super(6, 5);
        this.h = 4;
    }

    @Override
    public void getField(){
        System.out.println(a*h/2);
    }
    @Override
    public   void getCircuit(){
        System.out.println(2*b + a);


    }
}
