package problemSolving.getMinMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.lang.Integer.MIN_VALUE;

public class MinMaxStream {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 0, 5, 2, 7, 1, 8, 6, 9, 3);
//        int max = numbers.stream().max(Integer::compare).orElse(-1);
        int max = numbers.stream().max(Comparator.comparingInt(x -> x)).orElse(MIN_VALUE);
        int min = numbers.stream().min(Integer::compare).orElse(-1);

        System.out.println("Max: " + max);  // Max: 9
        System.out.println("Min: " + min);  // Min: 0
    }
}
