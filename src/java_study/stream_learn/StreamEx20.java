package java_study.stream_learn;

import java.util.Arrays;
import java.util.List;

public class StreamEx20 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer[] numberArray = numbers.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(numberArray));

    }
}
