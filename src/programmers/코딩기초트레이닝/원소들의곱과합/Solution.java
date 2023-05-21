package programmers.코딩기초트레이닝.원소들의곱과합;

import java.util.stream.IntStream;

public class Solution {
    public int solution(int[] num_list) {
        return  IntStream.of(num_list).reduce(1, (a, b) -> a * b) < Math.pow(IntStream.of(num_list).sum(), 2)  ? 1 : 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num_list = {5, 7, 8, 3};
        System.out.println(s.solution(num_list));
    }
}
