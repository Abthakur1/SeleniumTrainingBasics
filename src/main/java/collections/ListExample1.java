package collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("grapes");
        fruits.add("guava");
        System.out.println(fruits); //[Apple, Orange, grapes, guava]
    }
}
