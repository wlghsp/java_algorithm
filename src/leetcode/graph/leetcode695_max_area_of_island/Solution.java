package leetcode.graph.leetcode695_max_area_of_island;

public class Solution {

    int rows, cols;
    boolean[][] visited;

    public int maxAreaOfIsland(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        int area = 0;
        visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                area = Math.max(area, dfs(grid, i, j));
            }
        }
        return area;
    }

    private int dfs(int[][] grid, int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= cols ||
                visited[row][col] || grid[row][col] == 0) {
            return 0;
        }
        visited[row][col] = true;
        return (1 + dfs(grid, row - 1, col) +
                dfs(grid, row + 1, col) +
                dfs(grid, row, col + 1) +
                dfs(grid, row, col - 1)
        );
    }
}
