package programmers.코딩기초트레이닝.홀수vs짝수;

import java.util.stream.IntStream;

public class Solution {
    public int solution(int[] num_list) {
        return Integer.max(
                IntStream.iterate(0, i -> i < num_list.length, i -> i + 2)
                        .map(i -> num_list[i]).sum(),
                IntStream.iterate(1, i -> i < num_list.length, i -> i + 2)
                        .map(i -> num_list[i])
                        .sum()
        );
    }
    public int solution1(int[] num_list) {
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) oddSum += num_list[i];
            else evenSum += num_list[i];
        }
        return Math.max(oddSum, evenSum);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{4, 2, 6, 1, 7, 6})); // 17
    }
}
