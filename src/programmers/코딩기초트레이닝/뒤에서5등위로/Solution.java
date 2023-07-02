package programmers.코딩기초트레이닝.뒤에서5등위로;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list) {
        return Arrays.stream(num_list).sorted().skip(5).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(Arrays.toString(s.solution(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10})));
    }
}
