package baekjoon.silver.silver2.boj11123_양한마리양두마리;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int T, H, W;
    static boolean[][] visited;
    static String[] grid;
    static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj11123_양한마리양두마리/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            grid = new String[H];
            visited = new boolean[H][W];

            for (int i = 0; i < H; i++) {
                grid[i] = br.readLine();
            }
            // '#' 양, '.' 풀
            int cnt = 0;
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (!visited[i][j] && grid[i].charAt(j) == '#') {
                        cnt++;
                        dfs(i, j);
                    }
                }
            }
            System.out.println(cnt);
        }

    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int[] d : dir) {
            int nx = x + d[0];
            int ny = y + d[1];

            if (nx < 0 || ny < 0 || nx >= H || ny >= W) continue;
            if (visited[nx][ny]) continue;
            if (grid[nx].charAt(ny) == '.') continue;

            dfs(nx, ny);
        }
    }
}
