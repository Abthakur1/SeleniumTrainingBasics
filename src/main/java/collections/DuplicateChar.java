package collections;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {
    public static void main(String[] args) {
        String str = "aabbcddaee";
        Map<Character, Integer> mp = new HashMap<>();
        for(int i =0; i< str.length();i++) {
            if(mp.containsKey(str.charAt(i))){      // false   //2nd iteration true
                mp.put(str.charAt(i), mp.get(str.charAt(i))+1);  //2nd iteration mp.put(a, mp.get(a)+1 =2)  --> a,2

            }
            else {
                mp.put(str.charAt(i), 1);   //a,1
            }
        }

        for(Map.Entry<Character, Integer> entry: mp.entrySet()){
            if(entry.getValue()>1){
                System.out.println("Duplicate character:"+ entry.getKey());
            }

        }

    }
}
