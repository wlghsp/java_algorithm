package baekjoon.silver.silver1.boj16174_점프왕쩰리_large;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static boolean[][] visited;
    static int[][] board;
    static int[][] dir = {{0, 1}, {1, 0}};

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver1/boj16174_점프왕쩰리_large/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        visited = new boolean[N][N];
        board = new int[N][N];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);

        System.out.println(visited[N -1][N -1] ? "HaruHaru" : "Hing");
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int[] d : dir) {
            int nx = x + d[0] * board[x][y];
            int ny = y + d[1] * board[x][y];;

            if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
            if (visited[nx][ny]) continue;

            dfs(nx, ny);

        }
    }
}
