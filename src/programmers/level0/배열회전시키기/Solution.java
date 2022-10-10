package programmers.level0.배열회전시키기;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};

        return answer;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{1,2,3}, "right"))); // [3,1,2]
        System.out.println(Arrays.toString(s.solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left"))); // [455, 6, 4, -1, 45, 6, 4]
    }
}
