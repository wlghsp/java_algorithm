package baekjoon.silver.silver2.boj11725_트리의부모찾기;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static boolean[] visited;
    static int[] parents;
    static ArrayList<ArrayList<Integer>> tree = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj11725_트리의부모찾기/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i <= N; i++) {
            tree.add(new ArrayList<>());
        }

        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tree.get(a).add(b);
            tree.get(b).add(a);
        }

        visited = new boolean[N + 1];
        parents = new int[N + 1]; // 각 노드의 부모 저장

        // 부모노드부터 탐색하여 모든 노드의 부모를 한번에 찾음
        dfs(1);

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= N; i++) {
            sb.append(parents[i]).append('\n');
        }

        System.out.println(sb);

    }

    private static void dfs(int node) {
        visited[node] = true;

        for (Integer next : tree.get(node)) {
            if (!visited[next]) {
                parents[next] = node;
                dfs(next);
            }
        }
    }
}
