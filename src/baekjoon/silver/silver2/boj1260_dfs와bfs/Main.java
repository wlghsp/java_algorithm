package baekjoon.silver.silver2.boj1260_dfs와bfs;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N, M, V;
    static ArrayList<Integer>[] adj;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj1260_dfs와bfs/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        adj = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        for (int i = 1; i < N + 1; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a].add(b);
            adj[b].add(a);
        }

        for (int i = 1; i < N + 1; i++) {
            adj[i].sort(Comparator.naturalOrder());
        }

        dfs(V);
        sb.append(System.lineSeparator());

        visited = new boolean[N + 1];
        bfs(V);
        sb.append(System.lineSeparator());

        System.out.println(sb);

    }

    private static void dfs(int x) {
        visited[x] = true;
        sb.append(x).append(" ");

        for (Integer vertex : adj[x]) {
            if (!visited[vertex]) {
                dfs(vertex);
            }
        }
    }

    private static void bfs(int x) {
        visited[x] = true;
        sb.append(x).append(" ");

        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);

        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : adj[u]) {
                if (!visited[v]) {
                    queue.add(v);
                    visited[v] = true;
                    sb.append(v).append(" ");
                }
            }
        }
    }
}
