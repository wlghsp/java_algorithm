package baekjoon.silverⅤ.Boj16173_점프왕쩰리Small;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[][] board;
    static boolean[][] visited;
    static int[] dx = {1, 0};
    static int[] dy = {0, 1};

    public static boolean bfs(int x, int y) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);
        q.offer(y);
        visited[x][y] = true;
        while (!q.isEmpty()) {
            x = q.poll();
            y = q.poll();
            int dist = board[x][y];
            if (board[x][y] == -1) return true;

            for (int i = 0; i < 2; i++) {
                int nx = x + dx[i]*dist;
                int ny = y + dy[i]*dist;
                if (0 <= nx && nx < N && ny >= 0 && ny < N){
                    if (!visited[nx][ny]) {
                        visited[nx][ny] = true;
                        q.offer(nx);
                        q.offer(ny);
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        visited = new boolean[N][N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        if (bfs(0, 0)) {
            System.out.println("HaruHaru");
        } else {
            System.out.println("Hing");
        }

    }
}
