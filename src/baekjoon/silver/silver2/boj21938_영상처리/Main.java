package baekjoon.silver.silver2.boj21938_영상처리;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M, T, cnt;
    static boolean[][] visited;
    static int[][] pixels, newPixels;
    static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj21938_영상처리/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N][M];
        pixels = new int[N][M * 3];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3 * M; j++) {
                pixels[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        T = Integer.parseInt(br.readLine()); // 경계값 T
        newPixels = new int[N][M];

        for (int i = 0; i < N; i++) {
            int index = 0;
            for (int j = 0; j < M; j++) {
                int sum = 0;
                for (int k = 0; k < 3; k++) {
                    sum += pixels[i][index++];
                }
                newPixels[i][j] = (sum / 3) >= T ? 255 : 0;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j] && newPixels[i][j] == 255) {
                    cnt++;
                    dfs(i, j);
                }
            }
        }

        System.out.println(cnt);
    }

    private static void dfs(int i, int j) {
        visited[i][j] = true;

        for (int[] d : dir) {
            int nx = i + d[0];
            int ny = j + d[1];

            if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
            if (visited[nx][ny]) continue;
            if (newPixels[nx][ny] == 0) continue;

            dfs(nx, ny);
        }
    }
}
