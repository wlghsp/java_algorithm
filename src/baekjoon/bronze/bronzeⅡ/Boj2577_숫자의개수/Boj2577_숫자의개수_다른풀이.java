package baekjoon.bronze.bronzeⅡ.Boj2577_숫자의개수;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Boj2577_숫자의개수_다른풀이 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> map = Arrays.stream(Integer.toString(sc.nextInt() * sc.nextInt() * sc.nextInt()).split(""))
                .collect(Collectors.toMap(Integer::parseInt, s -> 1, Integer::sum));

        IntStream.range(0, 10).forEach(i -> System.out.println(map.getOrDefault(i, 0)));

    }
}
