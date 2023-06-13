package java_study.stream_learn;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamEx10_11 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> firstNumber = numbers.stream().findAny();
        System.out.println(firstNumber);

    }
}
