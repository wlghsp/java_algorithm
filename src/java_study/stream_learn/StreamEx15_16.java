package java_study.stream_learn;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamEx15_16 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> maxNumber = numbers.stream().max(Integer::compare);
        System.out.println(maxNumber);

        Optional<Integer> minNumber = numbers.stream().min(Integer::compare);
        System.out.println(minNumber);
    }
}
