package java_study.stream_learn;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx13 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Mary", "Tom", "Jerry");
        names.stream().forEach(System.out::println);

    }
}
