package baekjoon.silverⅠ.boj2178_미로탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main1 {

    static int N, M;
    static String[] map;
    static int[][] dir = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    static int[][] dist;

    private static void bfs(int x, int y) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        queue.add(y);
        dist[x][y] = 1;
        while (!queue.isEmpty()) {
            x = queue.poll();
            y = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = x + dir[i][0];
                int ny = y + dir[i][1];
                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                if (map[nx].charAt(ny) == '0') continue;
                if (dist[nx][ny] != -1) continue;

                dist[nx][ny] = dist[x][y] + 1;
                queue.add(nx);
                queue.add(ny);

            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new String[N];
        dist = new int[N][M];
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine();
        }
        for (int i = 0; i < N; i++) {
            Arrays.fill(dist[i], -1);
        }
        bfs(0, 0);
        System.out.println(dist[N - 1][M - 1]);

    }
}
