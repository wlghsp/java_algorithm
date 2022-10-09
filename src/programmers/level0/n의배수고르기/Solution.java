package programmers.level0.n의배수고르기;

import java.util.Arrays;

public class Solution {

    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(i -> i % n == 0).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12}))); // [6, 9, 12]
        System.out.println(Arrays.toString(s.solution(5, new int[]{1, 9, 3, 10, 13, 5})));           // [10, 5]
        System.out.println(Arrays.toString(s.solution(12, new int[]{2, 100, 120, 600, 12, 12})));    // [120, 600, 12, 12]
    }
}
