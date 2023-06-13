package java_study.stream_learn;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx12 {

    public static void main(String[] args) {
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );

        List<Integer> flattendList = nestedList.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(flattendList);

    }
}
