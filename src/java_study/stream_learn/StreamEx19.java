package java_study.stream_learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx19 {

    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> result = numbers.stream()
//                .peek(n -> System.out.print(n + " "))
//                .map(n -> n * 2)
//                .peek(n -> System.out.print(n + " "))
//                .collect(Collectors.toList());
//        System.out.println(result);


        List<String> names = Arrays.asList("John", "Mary", "Tom", "Jerry");
        List<String> upperCaseNames = new ArrayList<>();
        List<String> collectedNames = names.stream()
                .peek(name -> upperCaseNames.add(name))
                .collect(Collectors.toList());
        System.out.println(collectedNames);
        System.out.println(upperCaseNames);
    }
}
