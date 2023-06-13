package java_study.stream_learn;

import java.util.Arrays;
import java.util.List;

public class StreamEx7 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        boolean anyEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(anyEven);
    }
}
