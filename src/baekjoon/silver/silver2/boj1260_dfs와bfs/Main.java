package baekjoon.silver.silver2.boj1260_dfs와bfs;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M, V;
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj1260_dfs와bfs/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        visited = new boolean[N + 1];
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
        for (int i = 1; i <= N; i++) {
            ArrayList<Integer> integers = graph.get(i);
            integers.sort(Comparator.naturalOrder());
        }

        dfs(V);
        sb.setLength(sb.length() - 1);

        sb.append(System.lineSeparator());
        visited = new boolean[N + 1];
        bfs(V);

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }

    private static void dfs(int v) {
        visited[v] = true;
        sb.append(v).append(" ");


        for (Integer i : graph.get(v)) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }

    private static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        visited[v] = true;
        queue.add(v);
        sb.append(v).append(" ");

        while (!queue.isEmpty()) {
            int next = queue.poll();

            for (Integer i : graph.get(next)) {
                if (!visited[i]) {
                    queue.offer(i);
                    sb.append(i).append(" ");
                    visited[i] = true;
                }
            }


        }

    }
}
