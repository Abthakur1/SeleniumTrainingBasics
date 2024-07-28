package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(30);
        marks.add(20);
        marks.add(10);
        marks.add(50);
        marks.add(60);
        marks.add(70);

        // print a list:
        System.out.println(marks); // [30, 20, 10, 50, 60, 70]

        int getValueAtIndex = marks.get(2);
        System.out.println(getValueAtIndex); // 10

        System.out.println(marks.size()); // 6

        marks.remove(3);
        System.out.println(marks.size());//5


        // iterator

        Iterator<Integer> it = marks.iterator();
        while (it.hasNext()) {
            Integer val = it.next();
            System.out.println(val);
        }

        // other way of looping

        for(int i =0; i< marks.size(); i++) {
            System.out.println(marks.get(i));
        }
    }
}
