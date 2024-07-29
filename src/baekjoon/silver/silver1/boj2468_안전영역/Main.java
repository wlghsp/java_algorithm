package baekjoon.silver.silver1.boj2468_안전영역;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, areaCnt, maxHeight;
    static boolean[][] visited;
    static int[][] map;
    static int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver1/boj2468_안전영역/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        int ans = 1;
        map = new int[N][N];
        maxHeight = Integer.MIN_VALUE;
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int height = Integer.parseInt(st.nextToken());
                maxHeight = Math.max(maxHeight, height);
                map[i][j] = height;
            }
        }

        for (int height = 1; height < maxHeight; height++) {
            visited = new boolean[N][N];
            areaCnt = 0;

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (map[j][k] > height && !visited[j][k]) {
                        areaCnt++;
                        dfs(j, k, height);
                    }
                }
            }

            ans = Math.max(ans, areaCnt);
        }

        System.out.println(ans);


    }

    private static void dfs(int x, int y, int height) {
        visited[x][y] = true;

        for (int i = 0; i < dir.length; i++) {
            int nx = x + dir[i][0];
            int ny = y + dir[i][1];

            if (nx < 0 || ny < 0 || nx >= N || ny >= N)  continue;
            if (visited[nx][ny]) continue;
            if (map[nx][ny] <= height) continue;

            dfs(nx, ny, height);
        }
    }
}
