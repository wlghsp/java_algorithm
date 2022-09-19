package inflearn.DFS_BFS활용.q77_토마토_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    public int x, y;

    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main_복습 {
    static int M, N;
    static int[][] board, dis;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<Node> queue = new LinkedList<>();

    private String string;

    public void BFS() {
        while (!queue.isEmpty()) {
            Node tmp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >=1 && nx <= N && ny >= 1 && ny <= M && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    queue.offer(new Node(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Main_복습 T = new Main_복습();
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt(); // 가로, 열
        N = sc.nextInt(); // 세로, 행
        board = new int[N + 1][M + 1];
        dis = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                int tmp = sc.nextInt();
                board[i][j] = tmp;
                if (tmp == 1) {
                    queue.add(new Node(i, j));
                }
            }
        }

        T.BFS();
        boolean flag = true;
        int res = Integer.MIN_VALUE;
        // 익지 않은 토마토(0)가 있으면 flag false로 할당
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (board[i][j] == 0) flag = false;
                res = Math.max(res, dis[i][j]);
            }
        }

        if (flag){
            System.out.println(res);
        } else {
            System.out.println(-1);
        }


    }
}
