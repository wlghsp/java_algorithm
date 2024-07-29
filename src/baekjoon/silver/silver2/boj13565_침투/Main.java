package baekjoon.silver.silver2.boj13565_침투;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int M, N;
    static String ans;
    static boolean[][] visited;
    static String[] grid;
    static int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};


    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj13565_침투/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        visited = new boolean[M][N];
        grid = new String[M];
        for (int i = 0; i < M; i++) {
            grid[i] = br.readLine();
        }

        ans = "NO";
        for (int j = 0; j < N; j++) {
            if (grid[0].charAt(j) == '0' && !visited[0][j]) {
                dfs(0, j);
            }
        }

        System.out.println(ans);

    }

    private static void dfs(int x, int y) {
        if (x == M - 1) {
            ans = "YES";
            return;
        }

        visited[x][y] = true;

        for (int[] direction : directions) {
            int nx = x + direction[0];
            int ny = y + direction[1];

            if (nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
            if (visited[nx][ny]) continue;
            if (grid[nx].charAt(ny) == '1') continue;

            dfs(nx, ny);
            if (ans.equals("YES")) return;
        }
    }
}
