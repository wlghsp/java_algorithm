package programmers.코딩기초트레이닝.수열과구간쿼리4;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            for (int i = query[0]; i <= query[1]; i++) {
                if(i % query[2] == 0) {
                    arr[i] += 1;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{0,1,2,4,3}, new int[][]{
                {0,4,1}, {0, 3, 2}, {0, 3, 3}
        }))); // [3,2,4,6,4]
    }
}
