package programmers.level0._2차원으로만들기;

import java.util.Arrays;

public class Solution {

    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int k = 0;
        for (int i = 0; i < num_list.length/n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[k++];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        // [[1, 2], [3, 4], [5, 6], [7, 8]]
        System.out.println(Arrays.deepToString(s.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)));
        // [[100, 95, 2], [4, 5, 6], [18, 33, 948]]
        System.out.println(Arrays.deepToString(s.solution(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948}, 3)));
    }
}
