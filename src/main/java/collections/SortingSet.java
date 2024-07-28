package collections;

import java.util.Set;
import java.util.TreeSet;

public class SortingSet {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 45, 67, 45, 10, 34, 59, 80, 20};
        Set<Integer> sorted = new TreeSet<>();
        for(int a: arr) {
            sorted.add(a);

        }
        System.out.println(sorted);  // [10, 20, 34, 45, 59, 67, 80]
    }
}
