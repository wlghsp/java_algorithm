package baekjoon.silver.silver1.boj15900_나무탈출;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N, ans;
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> tree;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver1/boj15900_나무탈출/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        tree = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            tree.add(new ArrayList<>());
        }

        StringTokenizer st;
        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tree.get(a).add(b);
            tree.get(b).add(a);
        }

        visited = new boolean[N + 1];

        // 루트 노드에서 리프노드까지 깊이우선탐색
        dfs(1, 0);

        // 홀수면 승리, 짝수면 패배
        System.out.println(ans % 2 != 0 ? "Yes" : "No");

    }

    private static void dfs(int node, int cnt) {
        visited[node] = true;

        for (Integer next : tree.get(node)) {
            if (!visited[next]) {
                dfs(next, cnt + 1);
            }
        }

        // 리프노드 판별
        // 1인 루트노드가 아닌데 인접리스트에 1개만 남은 경우
        if (node != 1 && tree.get(node).size() == 1) {
            ans += cnt;
        }
    }
}
