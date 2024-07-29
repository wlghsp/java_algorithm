package baekjoon.silver.silver1.boj2583_영역구하기;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int M, N, K, area; // M, N 크기, K개 직사각형
    static int[][] map;
    static boolean[][] visited;
    static int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver1/boj2583_영역구하기/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[M][N];
        visited = new boolean[M][N];

        markArea(br);

        List<Integer> areas = new ArrayList<>();
        int areaCnt = 0;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && map[i][j] == 0) {
                    area = 0;
                    areaCnt++;
                    dfs(i, j);
                    areas.add(area);
                }
            }
        }

        areas.sort(Comparator.naturalOrder());

        StringBuilder sb = new StringBuilder();
        sb.append(areaCnt).append(System.lineSeparator());
        areas.forEach(area -> sb.append(area).append(" "));
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }

    private static void dfs(int y, int x) {
        visited[y][x] = true;
        area++;

        for (int[] dir : direction) {
            int ny =  y + dir[0];
            int nx = x + dir[1];

            if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
            if (visited[ny][nx]) continue;
            if (map[ny][nx] == 1) continue;

            dfs(ny, nx);
        }
    }


    private static void markArea(BufferedReader br) throws IOException {
        StringTokenizer st;
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    map[y][x] = 1;
                }
            }
        }
    }
}
