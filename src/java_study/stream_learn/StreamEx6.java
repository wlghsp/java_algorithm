package java_study.stream_learn;

import java.util.Arrays;
import java.util.List;

public class StreamEx6 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
        System.out.println(allEven);


        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        boolean allEven1 = numbers1.stream().allMatch(n -> n % 2 == 0);
        System.out.println(allEven1);
        
    }
}
