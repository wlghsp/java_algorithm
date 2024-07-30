package baekjoon.silver.silver1.boj1325_효율적인해킹;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M;
    static boolean[] visited;
    static int[] result;
    static ArrayList<ArrayList<Integer>> network;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver1/boj1325_효율적인해킹/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        network = new ArrayList<>();

        for (int i = 0; i < N + 1; i++) {
            network.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // A가 B를 신뢰한다. B를 해킹하면 A도 해킹 가능, 단방향그래프
            network.get(a).add(b);// b -> a
        }

        int maxCnt = 0;
        result = new int[N + 1];

        for (int start = 1; start <= N; start++) {
            visited = new boolean[N + 1]; // BFS 호출 전 초기화
            Queue<Integer> queue = new LinkedList<>();
            queue.add(start);
            visited[start] = true;

            while (!queue.isEmpty()) {
                Integer current = queue.poll();
                for (Integer next : network.get(current)) {
                    if (!visited[next]) {
                        visited[next] = true;
                        result[next]++;
                        queue.add(next);
                    }
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            if (maxCnt < result[i]) {
                maxCnt = result[i];
            }
        }

        for (int i = 1; i <= N; i++) {
            if (result[i] == maxCnt) {
                System.out.print(i + " ");
            }
        }
    }
}
