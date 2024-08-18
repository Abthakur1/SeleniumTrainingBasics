package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample3 {
    public static void main(String[] args) {
        Map<Integer, String> employerMap = new HashMap<>();
        employerMap.put(101, "Sumit");
        employerMap.put(102, "Vineet");
        employerMap.put(103, "Rachit");
        employerMap.put(104, "Gagan");
        employerMap.put(105, "Abhishek");

        // to get the keys from map

        for(Integer key: employerMap.keySet()) {
            System.out.println("Employee Id:"+ key);
        }

        // tp get the values from a map

        for(String name: employerMap.values()) {
            System.out.println("Employee name:"+ name);

        }

        for(Map.Entry<Integer, String> empEntry: employerMap.entrySet()){
            System.out.println("Employee Id is:"+ empEntry.getKey());
            System.out.println("Employee Name is:"+ empEntry.getValue());

        }

    }
}
