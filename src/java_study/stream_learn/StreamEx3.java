package java_study.stream_learn;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamEx3 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        System.out.println(sum.get());


        int[] arr = {1, 2, 3, 4, 5};
        int total = Arrays.stream(arr)
                .reduce(0, Integer::sum);
        System.out.println(total);
    }
}
