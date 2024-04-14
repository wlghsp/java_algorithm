package leetcode.graph.leetcode200_number_of_islands;

public class Solution {
    int rows, cols;
    public int numIslands(char[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        int numOfIslands = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    numOfIslands += dfs(grid, i, j);
                }
            }
        }
        return numOfIslands;
    }

    private int dfs(char[][] grid, int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] == '0') {
            return 0;
        }
        grid[row][col] = '0';
        // '1' -> '0' 으로 바꾸면서 방문 처리
        dfs(grid, row - 1, col);
        dfs(grid, row + 1, col);
        dfs(grid, row, col - 1);
        dfs(grid, row, col + 1);
        return 1;
    }
}
