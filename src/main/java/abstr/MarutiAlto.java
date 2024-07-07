package abstr;

public class MarutiAlto implements Car{
    @Override
    public void gear() {
        System.out.println("4 gears");

    }

    @Override
    public void brake() {
        System.out.println("normal brake");

    }

    @Override
    public void esclator() {
        System.out.println("normal escalator");

    }

    @Override
    public void clutch() {
        System.out.println("normal clutch");

    }

    @Override
    public void steering() {
        System.out.println("normal steering");

    }

    @Override
    public void engine() {
        System.out.println("800cc");

    }

    @Override
    public void fuel() {
        System.out.println("petrol");

    }

}
