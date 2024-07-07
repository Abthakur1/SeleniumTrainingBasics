package oopsPrinciples;

public class Summation {

    int x = 10;
    int y = 20;

    Summation() {
    }

    Summation(int a, int b) {
        this.x = a;
        this.y = b;
    }

    public int result () {
        return this.x + this.y;
    }

    public static void main(String[] args) {
        Summation sObj = new Summation();
        System.out.println(sObj.result());
        Summation sObj1 = new Summation(25,24);
        System.out.println(sObj1.result());
    }
}
