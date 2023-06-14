package programmers.코딩기초트레이닝.n번째원소부터;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        return IntStream.rangeClosed(n - 1, num_list.length - 1).map(i -> num_list[i]).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{2, 1, 6}, 3))); // [6]
        System.out.println(Arrays.toString(s.solution(new int[]{5, 2, 1, 7, 5}, 2))); // [2, 1, 7, 5]
    }
}
