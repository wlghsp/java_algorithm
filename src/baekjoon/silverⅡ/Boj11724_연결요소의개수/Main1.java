package baekjoon.silverⅡ.Boj11724_연결요소의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main1 {
    static ArrayList<Integer>[] A;
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        A = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        for (int i = 1; i < N + 1; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            A[u].add(v);
            A[v].add(u);
        }
        int cnt = 0;
        for (int i = 1; i < N + 1; i++) {
            if (!visited[i]) {
                cnt++;
                DFS(i);
            }
        }
        System.out.println(cnt);
    }
    private static void DFS(int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        for (int i : A[v]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }
}
