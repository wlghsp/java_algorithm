package baekjoon.silver.silver1.boj2667_단지번호붙이기;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    static int N, groupCnt;
    static String[] map;
    static boolean[][] visited;
    static ArrayList<Integer> group;
    static int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver1/boj2667_단지번호붙이기/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new String[N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine();
        }

        group = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && map[i].charAt(j) == '1') {
                    // 단지에 속한 집의 수 카운트
                    groupCnt = 0;
                    dfs(i, j);
                    group.add(groupCnt);
                }
            }
        }

        group.sort(Comparator.naturalOrder());

        System.out.println(group.size());
        group.forEach(System.out::println);

    }

    private static void dfs(int x, int y) {
        groupCnt++;
        visited[x][y] = true;
        for (int[] dir : dir) {
            int nx = x + dir[0];
            int ny = y + dir[1];

            if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
            if (map[nx].charAt(ny) == '0') continue;
            if (visited[nx][ny]) continue;

            dfs(nx, ny);
        }

    }
}
