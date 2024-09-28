package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,12,5,23,4,8);

        // filter out those numbers from list which are divisible by 2

       List<Integer> outputList =  list.stream().filter(it-> it % 2 ==0).collect(Collectors.toList());
       System.out.println(outputList); // [12, 4, 8]

    }
}
