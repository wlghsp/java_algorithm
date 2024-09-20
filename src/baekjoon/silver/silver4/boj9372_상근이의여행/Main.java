package baekjoon.silver.silver4.boj9372_상근이의여행;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int T, N, M;
    static int[][] routes;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver4/boj9372_상근이의여행/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            routes = new int[N + 1][N + 1];
            visited = new boolean[N + 1];

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                routes[a][b] = 1;
                routes[b][a] = 1;
            }
            // 국가의 수 - 1  이면 정답 정점의 갯수 - 1 = 간선의 갯수이자 길이

            // BFS 연습을 위해 코드 구현
            int edgeCnt = BFS();
            System.out.println(edgeCnt - 1);
        }
    }

    private static int BFS() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        int cnt = 0;
        while (!queue.isEmpty()) {
            int start = queue.poll();
            for (int i = 1; i <= N; i++) {
                if (!visited[i] && routes[start][i] == 1) {
                    visited[i] = true;
                    queue.add(i);
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
