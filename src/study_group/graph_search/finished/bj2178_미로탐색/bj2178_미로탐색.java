package study_group.graph_search.finished.bj2178_미로탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj2178_미로탐색 {

    /**
     * DFS는 시간초과 발생 됨.
     * 최단거리, 경로문제는 BFS가 효율적
     * dist라는 int[][]배열에 거리를 계속 기록하면서 이동하고 마지막에 원하는 좌표를 출력만 하면 됨.
     *
     */
    static int N,M;
    static String[] map;
    static int[][] dir = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    static int[][] dist;

    static void bfs(int x, int y) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        queue.add(y);
        dist[x][y] = 1; //
        while (!queue.isEmpty()) {
            x = queue.poll();
            y = queue.poll();
            for (int k = 0; k < 4; k++) {
                int nx = x + dir[k][0];
                int ny = y + dir[k][1];
                if (nx < 0|| nx >= N || ny < 0 || ny >= M) continue; // 지도의 범위 안에 있는가?
                if (map[nx].charAt(ny) == '0') continue; // 이동가능한 칸인가?
                if (dist[nx][ny] != -1) continue; // 방문여부 체크

                /** 핵심 **/
                dist[nx][ny] = dist[x][y] + 1;  // 한 칸 전진하므로 이전 값 + 1
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
