package programmers.코딩기초트레이닝.뒤에서5등까지;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list) {
        return Arrays.stream(num_list).sorted().limit(5).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        // [1, 4, 12, 14, 15]
        System.out.println(Arrays.toString(s.solution(new int[]{12, 4, 15, 46, 38, 1, 14})));
    }
}
