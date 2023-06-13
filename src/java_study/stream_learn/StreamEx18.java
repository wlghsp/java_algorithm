package java_study.stream_learn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx18 {

    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        List<Integer> numberList = numbers.collect(Collectors.toList());
        System.out.println(numberList);

    }
}
