package misc;

public class Example {

    static int age;
    static String name;

    static {
        System.out.println("Hey static block is called");   // before main method
    }

    public static void display() {

        System.out.println("age:"+ age);
        System.out.println("name"+ name);
    }

    public static void main(String[] args) {
        age = 30;
        name = "Rachit";
        display();
    }
}
