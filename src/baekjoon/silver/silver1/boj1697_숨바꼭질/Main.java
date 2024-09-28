package baekjoon.silver.silver1.boj1697_숨바꼭질;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, K;
    static int[] visited;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver1/boj1697_숨바꼭질/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 수빈이의 위치
        K = Integer.parseInt(st.nextToken()); // 동생의 위치

        bfs(N);
    }

    static void bfs(int start) {
        visited = new int[100001];

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = 1; // 시작점 1로 설정하고 방문처리

        while (!q.isEmpty()) {
            int current = q.poll();

            if (current == K) {
                // 시작점이 1이므로 1을 마이너스 해줌
                System.out.println(visited[current] - 1);
                return;
            }

            int[] nextPositions = {current * 2, current + 1, current - 1};

            for (int next : nextPositions) {
                if (next < 0 || next >= visited.length) continue;
                if (visited[next] != 0) continue;

                q.add(next);
                visited[next] = visited[current] + 1;
            }
        }

    }
}
