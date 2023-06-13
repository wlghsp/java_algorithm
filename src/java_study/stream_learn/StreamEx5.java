package java_study.stream_learn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx5 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);
        List<Integer> sortedNumbers = numbers.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(sortedNumbers);


        int[] arr = {5, 2, 8, 3, 1};
        Arrays.stream(arr)
                .sorted()
                .forEach(System.out::println);

    }
}
