package baekjoon.silver.silver2.boj18126_너구리구구;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static long ans;
    static boolean[] visited;
    static Map<Integer, List<int[]>> houses = new HashMap<>();

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj18126_너구리구구/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            houses.put(i, new ArrayList<>());
        }

        for (int i = 1; i <= N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            houses.get(a).add(new int[]{b, c});
            houses.get(b).add(new int[]{a, c});
        }
        ans = 0;
        dfs(1, 0);

        System.out.println(ans);
    }

    private static void dfs(int start, long distance) {
        visited[start] = true;
        if (ans < distance) ans = distance;

        for (int[] ints : houses.get(start)) {
            if (!visited[ints[0]]) {
                dfs(ints[0], distance + ints[1]);
            }
        }
    }
}
