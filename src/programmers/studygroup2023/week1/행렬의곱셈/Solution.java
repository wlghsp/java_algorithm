package programmers.studygroup2023.week1.행렬의곱셈;

import java.util.Arrays;

public class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int l = arr1.length;
        int m = arr2.length;
        int n = arr2[0].length;
        int[][] answer = new int[l][n];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = 0;
                for (int k = 0; k < m; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.deepToString(s.solution(new int[][]{
                {1, 4}, {3, 2}, {4, 1} // 3, 2
        }, new int[][]{{3, 3}, {3, 3}}))); // [[15, 15], [15, 15], [15, 15]]

        System.out.println(Arrays.deepToString(s.solution(new int[][]{
                {2, 3, 2}, {4, 2, 4}, {3, 1, 4} // 3, 2
        }, new int[][]{{5, 4, 3}, {2, 4, 1}, {3, 1, 1}}))); // [[22, 22, 11], [36, 28, 18], [29, 20, 14]]

    }
}
