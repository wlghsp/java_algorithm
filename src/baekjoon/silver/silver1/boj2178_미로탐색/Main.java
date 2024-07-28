package baekjoon.silver.silver1.boj2178_미로탐색;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, cnt;
    static String[] map;
    static boolean[][] visited;
    static int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};


    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver1/boj2178_미로탐색/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new String[N];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            map[i] = br.readLine();
        }

        int ans = bfs(0, 0);

        System.out.println(ans);
    }

    private static int bfs(int x, int y) {
        visited[x][y] = true;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y, 1});

        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int px = poll[0], py = poll[1];
            int dist = poll[2];

            if (px == N - 1 && py == M - 1) {
                return dist;
            }

            for (int i = 0; i < 4; i++) {
                int nx = poll[0] + dir[i][0];
                int ny = poll[1] + dir[i][1];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M)  continue;
                if (visited[nx][ny]) continue;
                if (map[nx].charAt(ny) == '0') continue;

                visited[nx][ny] = true;
                q.offer(new int[]{nx, ny, dist + 1});
            }
        }

        return -1;
    }
}
