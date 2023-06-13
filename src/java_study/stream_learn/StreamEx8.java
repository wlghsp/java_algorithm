package java_study.stream_learn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx8 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Mary", "Tom", "Jerry");
        List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(uppercaseNames);
    }
}
