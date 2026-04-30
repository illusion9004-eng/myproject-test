package streamexam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exam02 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        List<String> result = names.stream()
                .filter(x -> x.length() > 3)
                .map(String::toUpperCase)  //name->name.toUpperCase()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);

    }
}
