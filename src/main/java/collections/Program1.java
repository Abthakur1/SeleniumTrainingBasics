package collections;

import java.util.HashSet;
import java.util.Set;

public class Program1 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 45, 67, 45, 10, 34, 59, 80, 20};
        Set<Integer> set = new HashSet<>();
        for(int i =0 ; i< arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set); // [80, 34, 67, 20, 10, 59, 45]

        // alternative

        for(int a: arr) {   // for each loop
            set.add(a);
        }
        System.out.println(set);
    }
}
