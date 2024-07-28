package collections;

import java.util.*;
import java.util.stream.Collectors;

public class DiffSetList {
    public static void main(String[] args) {

        // List
        List<String> dictionary = new ArrayList<>();
        dictionary.add("Alphabets");
        dictionary.add("Blueberry");
        dictionary.add("Car");
        dictionary.add("Daring");
        dictionary.add("Eager");
        dictionary.add("Blueberry");
        dictionary.add("Daring");

        System.out.println("List of Dictionary:"+ dictionary);
        // List of Dictionary:[Alphabets, Blueberry, Car, Daring, Eager, Blueberry, Daring]
        // 1. Allowing the duplicates
        // 2. Insertion order maintains


        // Set
        Set<String> dictionarySet = new HashSet<>();
        dictionarySet.add("Alphabets");
        dictionarySet.add("Blueberry");
        dictionarySet.add("Car");
        dictionarySet.add("Daring");
        dictionarySet.add("Eager");
        dictionarySet.add("Blueberry");
        dictionarySet.add("Daring");

        System.out.println("Dictionary set:"+ dictionarySet);


        // output:
        //Dictionary set:[Eager, Car, Alphabets, Blueberry, Daring]
        // 1. Removes duplicates , duplicate is not allowed.
        // 2. No insertion order is maintained.

    }
}
