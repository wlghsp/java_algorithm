package inflearn.DFS_BFS활용.q78_섬나라아일랜드_DFS;

import java.util.Scanner;

public class Main {

    static int answer = 0, n;

    // 8방향 12시, 1시, 3시, 5시, 6시, 7시, 9시, 11시
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[][] board;

    public void DFS(int x, int y, int[][] board) {
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 1 && nx <= n && ny >= 1 && ny <= n && board[nx][ny] == 1){
                board[nx][ny] = 0;
                DFS(nx, ny, board);
            }
        }

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        board = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0;
                    T.DFS(i, j, board);
                }
            }
        }

        System.out.println(answer);


    }
}
