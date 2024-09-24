package inheritance.homework;

public class OperatingSystemLinux extends OperatingSystem{



    public OperatingSystemLinux(int year) {
        super(year);
    }

    @Override

    public void turnOn () {
        System.out.println("Turning on Linux system");

    }

    @Override
    public void turnOff(){
        System.out.println("Turning off Linux system");
    }
}
