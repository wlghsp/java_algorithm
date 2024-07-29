package baekjoon.silver.silver3.boj2606_바이러스;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N, M, cnt;
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> network = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver3/boj2606_바이러스/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        StringTokenizer st;

        visited = new boolean[N + 1];

        for (int i = 1; i <= N + 1; i++) {
            network.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            network.get(a).add(b);
            network.get(b).add(a);
        }

        dfs(1);

        System.out.println(cnt);
    }

    private static void dfs(int node) {
        visited[node] = true;

        for (Integer integer : network.get(node)) {
            if (!visited[integer]) {
                cnt++;
                dfs(integer);
            }
        }
    }
}
