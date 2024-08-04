package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

    // players and their scores
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Rahul", 20);
        mp.put("Dhoni", 30);
        mp.put("Kohli", 40);
        mp.put("Dinesh", 50);

        // get the score of Kohli
        System.out.println(mp.get("Kohli")); // 40

    }
}
