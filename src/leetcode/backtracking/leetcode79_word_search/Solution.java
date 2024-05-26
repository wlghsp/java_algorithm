package leetcode.backtracking.leetcode79_word_search;

public class Solution {
    boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        if (word.isEmpty()) return true;

        int row = board.length;
        int col = board[0].length;
        visited = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (search(board, word, 0, i, j)) return true;
            }
        }
        return false;
    }

    private boolean search(char[][] board, String word, int n, int i, int j) { // n은 word의 인덱스
        if (n == word.length()) return true;

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) return false;
        if (visited[i][j]) return false;
        if (word.charAt(n) != board[i][j]) return false;

        // 일치하는 칸을 찾은 경우
        visited[i][j] = true;
        boolean result = search(board, word, n + 1, i - 1, j)
                || search(board, word, n + 1, i + 1, j)
                || search(board, word, n + 1, i, j - 1)
                || search(board, word, n + 1, i, j + 1);

        // word 를 찾지 못하면 해당 칸을 다시 계산하기 위해 false 로 다시 갱신
        if (!result) visited[i][j] = false;
        return result;
    }

 }
