package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> marks = new HashSet<>();

        // to add elements in a set
        marks.add(20);
        marks.add(40);
        marks.add(49);
        marks.add(35);

        System.out.println(marks);  // [49, 35, 20, 40]
        System.out.println(marks.size()); // 4

// to remove elements from a set
        marks.remove(20);
        System.out.println(marks); //[49, 35, 40]
        System.out.println(marks.size());

        // to check the value is present in list
       System.out.println(marks.contains(20));  // false

        // iterate
        Iterator<Integer> it = marks.iterator();
        while (it.hasNext()){     // check the next element is present or not
            System.out.println(it.next());  // next element // 49, 35, 40
        }
    }
}
