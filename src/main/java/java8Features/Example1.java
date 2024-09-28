package java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.forEach(it -> System.out.println(it));   // ->  lambda expression
        list.forEach(it -> System.out.println(it.toString()));


        List<String> dictList = Arrays.asList("Butter", "Pine", "Day", "Fish", "God", "Peak", "Parrot");
        // get those strings from the list which starts with P

        dictList.forEach(it -> {
            if (it.startsWith("P")) {
                System.out.println(it);
            }
        });
    }
}
