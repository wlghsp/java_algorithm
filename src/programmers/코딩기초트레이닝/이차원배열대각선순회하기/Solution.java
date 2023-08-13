package programmers.코딩기초트레이닝.이차원배열대각선순회하기;

import java.util.stream.IntStream;

public class Solution {


    public int solution(int[][] board, int k) {
        return IntStream.range(0, board.length)
                .filter(i -> i <= k)
                .map(i -> IntStream.range(0, board[i].length).filter(j -> j <= k - i).map(j -> board[i][j]).sum())
                .sum();
    }
    public int solution1(int[][] board, int k) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ((i + j) <= k) answer += board[i][j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[][]{
                {0, 1, 2},{1, 2, 3},{2, 3, 4},{3, 4, 5}
        }, 2)); // 8
    }
}
