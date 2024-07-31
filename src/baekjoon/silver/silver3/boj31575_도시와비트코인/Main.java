package baekjoon.silver.silver3.boj31575_도시와비트코인;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static boolean[][] visited;
    static int[][] city;
    static int[][] dir = {{1, 0}, {0, 1}};

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver3/boj31575_도시와비트코인/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[M][N];
        city = new int[M][N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                city[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);

        System.out.println(visited[M - 1][N - 1] ? "Yes" : "No");
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int[] d : dir) {
            int nx = x + d[0];
            int ny = y + d[1];

            if (nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
            if (visited[nx][ny]) continue;
            if (city[nx][ny] == 0) continue;

            dfs(nx, ny);
        }
    }
}
