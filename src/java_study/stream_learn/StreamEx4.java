package java_study.stream_learn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx4 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1);
        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctNumbers);


        int[] arr = {1, 2, 3, 2, 4, 5, 1};
        Arrays.stream(arr)
                .distinct()
                .forEach(System.out::println);

    }
}
