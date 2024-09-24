package inheritance.homework;

public class OperatingSystemWindows extends OperatingSystem{

    public OperatingSystemWindows(int year) {
        super(year);

    }
    @Override

    public void turnOn () {
        System.out.println("Turning on Windows system");

    }

    @Override
    public void turnOff(){
        System.out.println("Turning off Windows system");
    }


}