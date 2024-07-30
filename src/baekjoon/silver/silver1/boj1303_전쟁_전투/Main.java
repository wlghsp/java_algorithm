package baekjoon.silver.silver1.boj1303_전쟁_전투;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M, wCnt, bCnt;
    static String[] ground;
    static boolean[][] visited;
    static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver1/boj1303_전쟁_전투/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        ground = new String[M];
        visited = new boolean[M][N];

        for (int i = 0; i < M; i++) {
            ground[i] = br.readLine();
        }
        /**
         * 흰색 W 아군
         * 파란색 B 적군
         */
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    if (ground[i].charAt(j) == 'W') {
                        int cnt = dfs(i, j, 'W');
                        wCnt += cnt * cnt;
                    } else {
                        int cnt = dfs(i, j, 'B');
                        bCnt += cnt * cnt;
                    }
                }
            }
        }

        System.out.println(wCnt + " " + bCnt);
    }

    private static int dfs(int x, int y, char color) {
        visited[x][y] = true;
        int cnt = 1;

        for (int[] d : dir) {
            int nx = x + d[0];
            int ny = y + d[1];

            if (nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
            if (visited[nx][ny]) continue;
            if (ground[nx].charAt(ny) != color) continue;

            cnt += dfs(nx, ny, color);
        }

        return cnt;
    }
}
