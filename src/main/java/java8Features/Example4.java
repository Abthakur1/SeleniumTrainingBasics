package java8Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,45,78,90,40,47);
        // get the maximum and min value

        int max = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max); // 90

        int min = list.stream().min((Comparator.naturalOrder())).get();
        System.out.println(min);  // 2
    }
}
