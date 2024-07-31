package baekjoon.silver.silver2.boj10552_dom;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M, P, cnt;
    static boolean[] visited;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj10552_dom/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        visited = new boolean[M + 1];
        arr = new int[M +1];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int loveC = Integer.parseInt(st.nextToken());
            int hateC = Integer.parseInt(st.nextToken());
            if (arr[hateC] == 0) {
                arr[hateC] = loveC;
            }
        }

        dfs(P);
        System.out.println(cnt);
    }

    private static void dfs(int hateC) {
        if (visited[hateC]) {
            cnt = -1;
            return;
        }

        if (arr[hateC] > 0) {
            visited[hateC] = true;
            cnt++;
            dfs(arr[hateC]);
        }
    }
}
