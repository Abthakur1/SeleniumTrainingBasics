package collections;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();
        mp.put(1,"Apple");
        mp.put(2,"Books");
        mp.put(3,"Cargo");
        mp.put(4, "Daughter");
        mp.put(5, "Exercise");

        // fetch all the keys
        for(Integer key: mp.keySet()) {
            System.out.println(key);
        }

        // fetch the values

        for(String val: mp.values()) {
            System.out.println(val);
        }

       for(Map.Entry<Integer, String> entry: mp.entrySet()) {
           System.out.println("key is: " + entry.getKey() + "and value is:"+ entry.getValue());

       }
    }
}
