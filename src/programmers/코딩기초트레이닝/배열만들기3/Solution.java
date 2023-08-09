package programmers.코딩기초트레이닝.배열만들기3;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int cnt = 0;
        for (int[] interval : intervals) {
            int a = interval[0];
            int b = interval[1];
            cnt += b - a + 1;
        }
        int[] answer = new int[cnt];
        int idx = 0;
        for (int[] interval : intervals) {
            for (int j = interval[0]; j <= interval[1]; j++) {
                answer[idx++] = arr[j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 2, 3, 4, 5}, new int[][]{{1, 3}, {0, 4}}))); // [2, 3, 4, 1, 2, 3, 4, 5]
    }
}
