package programmers.코딩기초트레이닝.특별한이차원배열1;

import java.util.Arrays;

public class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = i == j ? 1 : 0;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.deepToString(s.solution(3)));

    }
}