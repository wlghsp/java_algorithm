package inflearn.DFS_BFS활용.q77_토마토_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int n, m;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board, dis;

    static Queue<Point> queue = new LinkedList<>();

    public void BFS() {
        while (!queue.isEmpty()) {
            Point tmp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 1 && nx <= n && ny >= 1 && ny <= m && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    queue.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();

        board = new int[n + 1][m + 1];
        dis = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int tmp = sc.nextInt();
                board[i][j] = tmp;
                if (tmp == 1) {
                    queue.offer(new Point(i, j));
                }
            }
        }
        T.BFS();
        boolean flag = true;
        int result = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (board[i][j] == 0) flag = false;
                result = Math.max(result, dis[i][j]);
            }
        }

        if (flag) {
            System.out.println(result);
        } else System.out.println(-1);
    }
}
