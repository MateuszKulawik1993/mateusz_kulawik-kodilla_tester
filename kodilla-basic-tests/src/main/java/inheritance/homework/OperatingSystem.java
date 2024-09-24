package inheritance.homework;

public class OperatingSystem {
    int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOn(){
        System.out.println("Turning on computer system");

    }

    public void turnOff(){
        System.out.println("Turning off computer system");
    }

}

public static void main(String[] args) {

    OperatingSystemLinux operatingSystemLinux = new  OperatingSystemLinux(1991);
    OperatingSystemWindows operatingSystemWindows = new  OperatingSystemWindows(1985);

    operatingSystemLinux.turnOff();
    operatingSystemWindows.turnOn();


}

