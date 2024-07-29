package baekjoon.silver.silver1.boj1743_음식물피하기;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, M, K;
    static int[][] passage;
    static boolean[][] visited;
    static int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver1/boj1743_음식물피하기/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        passage = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            passage[r - 1][c - 1] = 1;
        }
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j] && passage[i][j] == 1) {
                    int size = dfs(i, j);
                    ans = Math.max(ans, size);
                }
            }
        }

        System.out.println(ans);

    }

    private static int dfs(int r, int c) {
        visited[r][c] = true;
        int size = 1;

        for (int[] d : dir) {
            int nr = r + d[0];
            int nc = c + d[1];

            if (nr < 0 || nr >= N || nc < 0 || nc >= M) continue;
            if (passage[nr][nc] == 0) continue;
            if (visited[nr][nc]) continue;

            size += dfs(nr, nc);
        }

        return size;
    }
}
