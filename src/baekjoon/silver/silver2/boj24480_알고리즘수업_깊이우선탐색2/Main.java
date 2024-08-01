package baekjoon.silver.silver2.boj24480_알고리즘수업_깊이우선탐색2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    static int N, M, R, order;
    static int[] visited;
    static ArrayList<ArrayList<Integer>> graph;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj24480_알고리즘수업_깊이우선탐색2/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        visited = new int[N + 1];
        graph = new ArrayList<>();
        for (int i = 0; i < N + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        for (int i = 0; i <= N; i++) {
            graph.get(i).sort(Comparator.reverseOrder());
        }

        dfs(R);

        for (int i = 1; i <= N; i++) {
            sb.append(visited[i]).append("\n");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }

    private static void dfs(int vertex) {
        order++;
        visited[vertex] = order;

        for (Integer next : graph.get(vertex)) {
            if (visited[next] == 0) {
                dfs(next);
            }
        }

    }
}
