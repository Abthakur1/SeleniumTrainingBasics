package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> mp = new HashMap<>();
        mp.put("name", "Sumit");
        mp.put("age", "25");
        mp.put("occupation", "SE");
        mp.put("location", "Delhi");

        System.out.println(mp.get("name")); // Sumit
        System.out.println(mp.get("age")); // 25

    }
}
