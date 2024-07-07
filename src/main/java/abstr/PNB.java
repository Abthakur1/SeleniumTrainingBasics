package abstr;

//implentation class of Bank abstract class
public class PNB extends Bank{
    @Override
    public void roi() {
        System.out.println("8%");

    }

    public static void main(String[] args) {
       PNB p = new PNB();
       p.roi();
       p.setCustomerDetails();
    }
}
