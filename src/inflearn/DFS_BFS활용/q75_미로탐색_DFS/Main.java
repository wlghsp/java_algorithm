package inflearn.DFS_BFS활용.q75_미로탐색_DFS;

import java.util.Scanner;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] grid = new int[8][8];
    static int cnt = 0;

    public void DFS(int x, int y) {
        if (x == 7 && y == 7)  cnt++;
        else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && grid[nx][ny] == 0 ) {
                    grid[nx][ny] = 1;
                    DFS(nx, ny);
                    grid[nx][ny] = 0;
                }
            }

        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        grid[1][1] = 1;
        T.DFS(1, 1);
        System.out.println(cnt);
    }
}
