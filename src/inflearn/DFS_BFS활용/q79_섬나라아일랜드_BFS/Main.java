package inflearn.DFS_BFS활용.q79_섬나라아일랜드_BFS;

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

    static int answer = 0, N;
    // 8방향 12시, 1시, 3시, 5시, 6시, 7시, 9시, 11시
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[][] board = new int[21][21];
    Queue<Point> queue = new LinkedList<>();

    public void BFS(int x, int y) {

        queue.add(new Point(x, y));
        while (!queue.isEmpty()) {
            Point tmp = queue.poll();
            for (int i = 0; i < 8; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx>=1 && nx <= N && ny >= 1 && ny <= N && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    queue.add(new Point(nx, ny));
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0;
                    T.BFS(i, j);
                }
            }
        }

        System.out.println(answer);

    }
}
