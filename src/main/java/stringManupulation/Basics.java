package stringManupulation;

public class Basics {

    public static void main(String[] args) {
        String str1 = new String("Selenium");   // how many objects will be created 2   // Object created
                                                        // in Heap and SCP.
        System.out.println(str1); // Selenium

        // string literal
        String str2 = "Selenium";   // object creation only in SCP
        System.out.println(str2); // Selenium

    }
}
