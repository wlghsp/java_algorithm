package programmers.level0.최댓값만들기_1;

import java.util.Arrays;

public class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, 3, 4, 5})); // 20
        System.out.println(s.solution(new int[]{0, 31, 24, 10, 1, 9})); // 744
    }
}
