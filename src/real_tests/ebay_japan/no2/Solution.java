package real_tests.ebay_japan.no2;

public class Solution {
    int minSum  = Integer.MAX_VALUE;
    int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    boolean[][] visited;
    int[][] board;
    int n, k;

    public int Solution(int N, int[] board1){
        n = N;
        k = n/ 2;
        board = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = board1[i * n + j];
            }
        }

        dfs(k, k, board[k][k]);

        return minSum;
    }

    private void dfs(int x, int y, int currentSum) {
        // 현재 위치가 경계에 도달했을 때, 최솟값 업데이트
        if (x == 0 || y == 0 || x == n - 1 || y == n - 1) {
            minSum = Math.min(minSum, currentSum);
            return;
        }

        visited[x][y] = true;

        for (int[] dir : directions) {
            int newX = x + dir[0];
            int newY = y + dir[1];

            if (newX >= 0 && newY >= 0 && newX < n && newY < n && !visited[newX][newY] && newX != newY) {
                int newDist = Math.max(Math.abs(newX - k), Math.abs(newY - k));
                int currentDist = Math.max(Math.abs(x - k), Math.abs(y - k));
                if (newDist >= currentDist) {
                    dfs(newX, newY, currentSum + board[newX][newY]);
                }
            }
        }

        visited[x][y] = false;
    }
}
