package oopsPrinciples;

public class Horse extends Animal{

    public void eat() {
        System.out.println("Horse eat");
    }

    public static void main(String[] args) {
        Animal a = new Animal();  // creating object of parent , parent ref.
        a.eat();   // --> Animal

        Animal b = new Horse(); // creating object of child and ref of parent
        b.eat();  // ---> horse

        Horse c = new Horse();
        c.eat();   // --> horse


    }
}
