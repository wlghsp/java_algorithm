package baekjoon.silver.silver1.boj14940_쉬운최단거리;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N, M, goalX, goalY;
    static int[][] map, dist;
    static boolean[][] visited;
    static int[] dx = {0, 1, -1, 0};
    static int[] dy = {1, 0, 0, -1};

    public static void main(String[] args) throws IOException {
        init();
        bfs();
        printResult();
    }

    private static void init() throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver1/boj14940_쉬운최단거리/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        dist = new int[N][M];
        visited = new boolean[N][M];
        for (int[] row : dist) {
            Arrays.fill(row, -1); // 도달할 수 없는 곳 표시를 위한 -1 초기화
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int ground = Integer.parseInt(st.nextToken());
                map[i][j] = ground;
                if (ground == 2) {
                    goalX = i;
                    goalY = j;
                    dist[i][j] = 0; // 시작점
                } else if (ground == 0) {
                    dist[i][j] = 0; // 원래 갈 수 없는 땅
                }
            }
        }
    }

    private static void bfs() {
        Queue<int[]> queue = initializeBfs();

        while (!queue.isEmpty()) {
            int[] data = queue.poll();
            int x = data[0];
            int y = data[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (isInvalidMove(nx, ny)) continue;

                processVisit(nx, ny, queue, x, y);
            }
        }
    }

    private static void printResult() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(dist[i][j]).append(" ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    private static Queue<int[]> initializeBfs() {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{goalX, goalY});
        visited[goalX][goalY] = true;
        return queue;
    }

    private static boolean isInvalidMove(int nx, int ny) {
        return nx < 0 || nx >= N || ny < 0 || ny >= M || map[nx][ny] == 0 || visited[nx][ny];
    }

    private static void processVisit(int nx, int ny, Queue<int[]> queue, int x, int y) {
        visited[nx][ny] = true;
        queue.add(new int[]{nx, ny});
        dist[nx][ny] = dist[x][y] + 1;
    }
}
