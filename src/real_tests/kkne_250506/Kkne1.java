package real_tests.kkne_250506;

public class Kkne1 {

    static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int N;
    static boolean[][] visited;
    static int maxLength = -1;
    public int solution(int[][] board) {
        N = board.length;
        visited = new boolean[N][N];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (canConnect(i, j, board)) {
                    dfs(i, j, board, board[i][j], 1);
                }
            }
        }
        return maxLength;
    }

    private void dfs(int i, int j, int[][] board, int num, int length) {
        visited[i][j] = true;
        maxLength = Math.max(maxLength, length);

        for (int k = 0; k < 4; k++) {
            int x = i + dir[k][0], y = j + dir[k][1];

            if (0 > x || x >= N || 0 > y || y >= N) continue;
            if (visited[x][y]) continue;
            if (board[x][y] != num) continue;

            dfs(x, y, board, num, length + 1);
        }

        visited[i][j] = false;
    }

    private boolean canConnect(int i, int j, int[][] board) {
        int num = board[i][j];
        for (int k = 0; k < 4; k++) {
            int x = i + dir[k][0], y = j + dir[k][1];
            if (0 > x || x >= N || 0 > y || y >= N) continue;

            if (board[x][y] == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Kkne1 kkne1 = new Kkne1();
        int result = kkne1.solution(new int[][]{{3, 2, 3, 2}, {2, 1, 1, 2}, {1, 1, 2, 1}, {4, 1, 1, 1}});
        System.out.println(result); //7
    }
}
