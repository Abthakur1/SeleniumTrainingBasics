package java8Features;

import com.microsoft.schemas.office.visio.x2012.main.SectionType;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example3 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("The", "Ball", "Cat", "Ball");
        // Print the duplicate string
        Set<String> set = new HashSet<>();

        list.stream().filter(it->!set.add(it)).forEach(it-> System.out.println(it)); // Ball

    }
}
