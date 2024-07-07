package abstr;


// implemenation class
public class Nexon  implements Car{


    @Override
    public void gear() {
        System.out.println("6 gears");

    }

    @Override
    public void brake() {
        System.out.println("power brake");

    }

    @Override
    public void esclator() {
        System.out.println("more advanced esclataor");

    }

    @Override
    public void clutch() {
        System.out.println("more advanced clutch");

    }

    @Override
    public void steering() {
        System.out.println("power steering");

    }

    @Override
    public void engine() {
        System.out.println("1200 cc");

    }

    @Override
    public void fuel() {
        System.out.println("petrol ");
        System.out.println("diesel ");
        System.out.println("electric ");

    }
}
