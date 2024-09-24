package inheritance.homework;

public class Doctor extends Job{

    public Doctor() {
        super(9000, "Treat people");
    }

    @Override
    public void earnMoney(){
        System.out.println("My doctor earns"+ ""+""+salary);

    }
    @Override
    public void mainResponsibility(){
        System.out.println( "Doctors" +""+ responsibilities+""+""+"poeple.");

    }
}

