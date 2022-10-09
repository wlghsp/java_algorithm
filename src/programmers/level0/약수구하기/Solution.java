package programmers.level0.약수구하기;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n)
                .filter(i -> n % i == 0)
                .toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(24))); // [1, 2, 3, 4, 6, 8, 12, 24]
        System.out.println(Arrays.toString(s.solution(29))); // [1, 29]

    }
}
