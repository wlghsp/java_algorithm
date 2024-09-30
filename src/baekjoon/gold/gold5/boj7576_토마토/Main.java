package baekjoon.gold.gold5.boj7576_토마토;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node {
    int x, y;
    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int M, N, maxDays;
    static Queue<Node> q = new LinkedList<>();
    static int[][] map, dist;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    private static void bfs() {

        while (!q.isEmpty()) {
            Node node = q.poll();
            int x = node.x, y = node.y;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if (dist[nx][ny] != 0) continue;

                map[nx][ny] = 1;
                dist[nx][ny] = dist[x][y] + 1;
                maxDays = Math.max(maxDays, dist[nx][ny]);
                q.offer(new Node(nx, ny));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/gold/gold5/boj7576_토마토/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken()); // 가로
        N = Integer.parseInt(st.nextToken());  // 세로
        map = new int[N][M];
        dist = new int[N][M];

        boolean isAllRiped = true;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int num = Integer.parseInt(st.nextToken());
                map[i][j] = num;
                if (num == 1) { // 익은 토마토 큐에 담기
                    q.add(new Node(i, j));
                }
                if (num == 0) { // 익지 않은 토마토 있는지 확인
                    isAllRiped = false;
                }
            }
        }

        if (isAllRiped) {
            System.out.println(0);
            return;
        }

        bfs();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(maxDays);
    }

}
