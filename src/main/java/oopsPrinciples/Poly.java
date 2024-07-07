package oopsPrinciples;

public class Poly {

    public int sum (int x, int y) {
        return  x+y;
    }

    public int sum (int x , int y, int z) {
        return  x + y+z;
    }

    public double sum(double x , double y) {
        return  x+ y;
    }

    public double sum (int x, int y, double z) {
        return  x+ y+ z;
    }

    public static void main(String[] args) {
        Poly p = new Poly();
       System.out.println(p.sum(2, 4));  // --> 1st method will be called // 6
        System.out.println(p.sum(2,3,4)); // 2nd // 9
        System.out.println(p.sum(2.5, 6.8));  // 3rd // 9.3

    }
}
