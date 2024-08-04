package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setExampl1 {
    public static void main(String[] args) {
        // create a set of country
        Set<String> country = new HashSet<>();
        // other way
//        HashSet<String> country = new HashSet<>();   -- this is also a valid declaration
        country.add("India");
        country.add("Japan");
        country.add("China");
        country.add("America");

        System.out.println(country); // [Japan, China, America, India]

        // Country name is : India

        // iterator

        Set<String> outputSet = new HashSet<>();

        Iterator it = country.iterator();
        while (it.hasNext()) {
            String countr = (String) it.next();
            String outcome = "Country name is :" + countr;
            System.out.println(outcome);
            outputSet.add(outcome);
        }
        System.out.println(outputSet); //[Country name is :Japan, Country name is :India, Country name is :America, Country name is :China]

    }
}
