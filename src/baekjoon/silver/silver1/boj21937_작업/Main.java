package baekjoon.silver.silver1.boj21937_작업;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static int N, M, X, cnt;
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> tasks;


    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver1/boj21937_작업/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        tasks = new ArrayList<>();

        for (int i = 0; i < N + 1; i++) {
            tasks.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tasks.get(b).add(a);
        }

        X = Integer.parseInt(br.readLine());

        cnt = 0; // 초기화
        dfs(X);

        System.out.println(cnt);
    }

    private static void dfs(int x) {
        visited[x] = true;

        for (Integer next : tasks.get(x)) {
            if (!visited[next]) {
                cnt++;
                dfs(next);
            }
        }
    }
}
