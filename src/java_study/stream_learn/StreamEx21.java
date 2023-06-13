package java_study.stream_learn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx21 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> skippedNumbers = numbers.stream().skip(3).collect(Collectors.toList());
        System.out.println(skippedNumbers);

    }
}
