package baekjoon.silver.silver2.boj21736_헌내기는친구가필요해;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M, doX, doY, ans;
    static String[] campus;
    static boolean[][] visited;
    static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj21736_헌내기는친구가필요해/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        campus = new String[N];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            // "I" 도연이 찾기
            campus[i] = br.readLine();
            for (int j = 0; j < M; j++) {
                if (campus[i].charAt(j) == 'I') {
                    doX = i;
                    doY = j;
                }
            }
        }

        dfs(doX, doY);

        System.out.println(ans == 0 ? "TT" : ans);
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int[] d : dir) {
            int nx = x + d[0];
            int ny = y + d[1];

            if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;

            if (visited[nx][ny]) continue;
            char nextC = campus[nx].charAt(ny);

            if (nextC == 'X') continue;
            if (nextC == 'P') ans++;

            dfs(nx, ny);

        }
    }
}
