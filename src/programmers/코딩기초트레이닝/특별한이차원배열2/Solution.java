package programmers.코딩기초트레이닝.특별한이차원배열2;

public class Solution {
    public int solution(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != arr[j][i]) return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[][]{{5, 192, 33}, {192, 72, 95}, {33, 95, 999}})); // 1
    }
}
