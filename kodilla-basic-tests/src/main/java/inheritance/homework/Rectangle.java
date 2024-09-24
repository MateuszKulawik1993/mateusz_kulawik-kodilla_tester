package inheritance.homework;


public class Rectangle extends Shape{

    public Rectangle() {
        super(5, 6);
    }

    @Override
    public void getField(){
        System.out.println(a*b);
    }
    @Override
    public  void getCircuit() {
        System.out.println(2 * a + 2 * b);
    }

}
