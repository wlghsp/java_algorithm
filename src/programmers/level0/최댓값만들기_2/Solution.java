package programmers.level0.최댓값만들기_2;

import java.util.Arrays;

public class Solution {

    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        if (numbers[0] < 0 && numbers[1] < 0) {
            return Math.max(numbers[0] * numbers[1], answer);
        } else {
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, -3, 4, -5})); // 15
        System.out.println(s.solution(new int[]{0, -31, 24, 10, 1, 9})); // 240
        System.out.println(s.solution(new int[]{10, 20, 30, 5, 5, 20, 5})); // 600
    }
}
