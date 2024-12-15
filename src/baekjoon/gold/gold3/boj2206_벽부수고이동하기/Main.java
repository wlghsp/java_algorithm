package baekjoon.gold.gold3.boj2206_벽부수고이동하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            String row = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = row.charAt(j) - '0';
            }
        }

        System.out.println(bfs());
    }

    private static int bfs() {
        boolean[][][] visited = new boolean[N][M][2];
        Queue<Node> q = new LinkedList<>();

        // 시작 위치 초기화
        q.add(new Node(0, 0, 1, 1));
        visited[0][0][1] = true;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            Node cur = q.poll();

            if (cur.x == N - 1 && cur.y == M - 1) {
                return cur.distance;
            }

            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;

                // 벽이 아닌 경우
                if (map[nx][ny] == 0 && !visited[nx][ny][cur.canBreak]) {
                    visited[nx][ny][cur.canBreak] = true;
                    q.add(new Node(nx, ny, cur.distance + 1, cur.canBreak));
                }

                // 벽이고 벽을 부술 수 있는 경우
                if (map[nx][ny] == 1 && cur.canBreak == 1 && !visited[nx][ny][0]) {
                    visited[nx][ny][0] = true;
                    q.add(new Node(nx, ny, cur.distance + 1, 0)); // 이미 부숴서 0
                }
            }
        }

        return -1;
    }

}

class Node {
    int x, y, distance, canBreak;

    public Node(int x, int y, int distance, int canBreak) {
        this.x = x;
        this.y = y;
        this.distance = distance;
        this.canBreak = canBreak;
    }
}
