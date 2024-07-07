package packAnimal;

import oopsPrinciples.Animal;
import oopsPrinciples.Horse;

public class Test {

    public static void main(String[] args) {
        Animal a = new Animal();  // creating object of parent , parent ref.
        a.eat();   // --> Animal

        Animal b = new Horse(); // creating object of child and ref of parent
        b.eat();  // ---> horse

        Horse c = new Horse();
        c.eat();   // --> horse
    }
}
