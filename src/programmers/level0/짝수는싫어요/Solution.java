package programmers.level0.짝수는싫어요;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

    public int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(i -> i % 2 != 0).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(10))); // [1,3,5,7,9]
        System.out.println(Arrays.toString(s.solution(15))); // [1,3,5,7,9,11,13,15]
    }
}
