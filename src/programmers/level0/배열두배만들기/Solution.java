package programmers.level0.배열두배만들기;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 2, 3, 4, 5}))); // 	[2, 4, 6, 8, 10]
        System.out.println(Arrays.toString(s.solution(new int[]{1, 2, 100, -99, 1, 2, 3}))); // [2, 4, 200, -198, 2, 4, 6]
    }
}
