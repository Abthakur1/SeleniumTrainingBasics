package abstr;

public interface Car {

    void gear();    // abstract methods --> unimplemeted, public
    void brake();
    void esclator();
    void clutch();
    void steering();
    void engine();
    void fuel();

    default void tyres() {
        System.out.println("4 tyres");
    }
}
