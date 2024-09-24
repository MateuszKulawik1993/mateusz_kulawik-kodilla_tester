package inheritance.homework;

public class Main {
    public static void main(String[] args) {

        OperatingSystemLinux operatingSystemLinux = new  OperatingSystemLinux(1991);
        OperatingSystemWindows operatingSystemWindows = new  OperatingSystemWindows(1985);

        operatingSystemLinux.turnOff();
        operatingSystemWindows.turnOn();


    }
}
