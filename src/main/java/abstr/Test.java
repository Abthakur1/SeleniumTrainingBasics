package abstr;

public class Test {
    public static void main(String[] args) {
        Nexon nx = new Nexon();
        MarutiAlto alto = new MarutiAlto();

        System.out.println("nexon features:");
        nx.brake();
        nx.clutch();
        nx.engine();
        nx.esclator();
        nx.fuel();
        nx.gear();
        nx.steering();
        nx.tyres();

        System.out.println("\n");
        System.out.println("maruti car feature:");

        alto.brake();
        alto.clutch();
        alto.engine();
        alto.brake();
        alto.esclator();
        alto.fuel();
        alto.tyres();
    }
}
