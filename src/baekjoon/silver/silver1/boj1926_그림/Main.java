package baekjoon.silver.silver1.boj1926_그림;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N, M, areaCnt, maxArea;
    static int[][] paper;
    static boolean[][] visited;
    static ArrayList<Integer> areas = new ArrayList<>();
    static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver1/boj1926_그림/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        paper = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j] && paper[i][j] == 1) {
                    areaCnt++;
                    int area = dfs(i, j);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        System.out.println(areaCnt + "\n" + maxArea);
    }

    private static int dfs(int x, int y) {
        visited[x][y] = true;
        int area = 1;

        for (int i = 0; i < dir.length; i++) {
            int nx = x + dir[i][0];
            int ny = y + dir[i][1];

            if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
            if (visited[nx][ny]) continue;
            if (paper[nx][ny] == 0) continue;

            area += dfs(nx, ny);
        }

        return area;
    }
}
