package baekjoon.silver.silver2.boj14248_점프점프;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, S, ans;
    static int[] jumps;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj14248_점프점프/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(br.readLine());

        jumps = new int[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
          jumps[i] = Integer.parseInt(st.nextToken());
        }

        dfs(S);

        System.out.println(ans);
    }

    private static void dfs(int current) {
        visited[current] = true;
        ans++;

        if (current + jumps[current] <= N && !visited[current + jumps[current]]) {
            dfs(current + jumps[current]);
        }
        if (current - jumps[current] >= 1 && !visited[current - jumps[current]]) {
            dfs(current - jumps[current]);
        }

    }
}
