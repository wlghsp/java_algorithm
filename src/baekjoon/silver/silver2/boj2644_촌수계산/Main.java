package baekjoon.silver.silver2.boj2644_촌수계산;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static int N, A, B, M, ans;
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> relationship = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj2644_촌수계산/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(br.readLine());

        visited = new boolean[N + 1];

        for (int i = 0; i < N + 1; i++) {
            relationship.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            relationship.get(a).add(b);
            relationship.get(b).add(a);
        }

        ans = -1;
        dfs(A, B, 0);
        System.out.println(ans);
    }

    private static void dfs(int start, int end, int cnt) {
        if (start == end) {
            ans = cnt;
            return;
        }

        visited[start] = true;
        for (Integer num : relationship.get(start)) {
            if (!visited[num]) {
                dfs(num, end,cnt + 1);
            }
        }
    }
}
