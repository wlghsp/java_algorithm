package programmers.level0.진료순서정하기;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Arrays.fill(answer, 1);
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                    if (emergency[i] < emergency[j]) answer[i]++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{3, 76, 24}))); // [3, 1, 2]
        System.out.println(Arrays.toString(s.solution(new int[]{3, 76, 24}))); // [3, 1, 2]
        System.out.println(Arrays.toString(s.solution(new int[]{30, 10, 23, 6, 100}))); // [2, 4, 3, 5, 1]
    }
}
