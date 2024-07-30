package baekjoon.silver.silver1.boj1189_컴백홈;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int R, C, K, ans;
    static boolean[][] visited;
    static String[] path;
    static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int endX = 0, endY;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver1/boj1189_컴백홈/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        path = new String[R];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            path[i] = br.readLine();
        }
        endY = C - 1;

        dfs(R - 1, 0, 1);

        System.out.println(ans);
    }

    static void dfs(int r, int c, int dist) {
        if (dist == K && r == endX && c == endY) {
            ans++;
            return;
        }

        visited[r][c] = true;

        for (int[] d : dir) {
            int nx = r + d[0];
            int ny = c + d[1];

            if (nx < 0 || ny < 0 || nx >= R || ny >= C) continue;
            if (visited[nx][ny]) continue;
            if (path[nx].charAt(ny) == 'T') continue;

            dfs(nx, ny, dist + 1);
        }

        visited[r][c] = false;
    }
}
