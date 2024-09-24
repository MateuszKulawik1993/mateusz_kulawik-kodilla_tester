package basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        double c= 5.0;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);

        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(a, b);
        boolean correct1 = ResultChecker.assertEquals(-3, subtractResult);

        if (correct1) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }


        double Math.powResult = calculator.Math.pow(c, 2);
        boolean correct2 = ResultChecker.assertEquals(25, Math.powResult);

        if (correct2) {
            System.out.println("Metoda Math.powResult działa poprawnie dla liczby " + c);
        } else {
            System.out.println("Metoda Math.powResult nie działa poprawnie dla liczb " + c);
        }


    }

}
