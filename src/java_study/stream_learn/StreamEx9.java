package java_study.stream_learn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx9 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Mary", "Tom", "Jerry");
        long count = names.stream().count();
        System.out.println(count);
    }
}
