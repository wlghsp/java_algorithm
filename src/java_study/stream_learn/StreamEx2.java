package java_study.stream_learn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Mary", "Tom", "Jerry");
        List<Integer> nameLengths = names.stream().map(String::length).collect(Collectors.toList());
        System.out.println(nameLengths);


        int[] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr)
                .map(n -> n * n)
                .forEach(System.out::println);

    }
}
