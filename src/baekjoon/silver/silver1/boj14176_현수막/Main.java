package baekjoon.silver.silver1.boj14176_현수막;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int M, N;
    static boolean[][] visited;
    static int[][] banner;
    static int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {-1, -1}, {-1, 1}, {1, -1}};

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver1/boj14176_현수막/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        visited = new boolean[M][N];
        banner = new int[M][N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                banner[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int ans = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && banner[i][j] == 1) {
                    ans++;
                    dfs(i, j);
                }
            }
        }

        System.out.println(ans);

    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < dir.length; i++) {
            int nx = x + dir[i][0];
            int ny = y + dir[i][1];

            if (nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
            if (visited[nx][ny]) continue;
            if (banner[nx][ny] == 0) continue;

            dfs(nx, ny);
        }
    }
}
