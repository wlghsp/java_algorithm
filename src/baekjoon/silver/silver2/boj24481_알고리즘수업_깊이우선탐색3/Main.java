package baekjoon.silver.silver2.boj24481_알고리즘수업_깊이우선탐색3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    static int N, M, R, order;
    static int[] depths;
    static ArrayList<ArrayList<Integer>> graph;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj24481_알고리즘수업_깊이우선탐색3/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        depths = new int[N + 1];
        Arrays.fill(depths, -1);

        graph = new ArrayList<>();
        for (int i = 0; i < N + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        for (int i = 0; i <= N; i++) {
            graph.get(i).sort(Comparator.naturalOrder());
        }

        dfs(R, 0);

        String result = Arrays.stream(depths, 1, N + 1)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(System.lineSeparator()));
        System.out.println(result);
    }

    private static void dfs(int vertex, int depth) {
        depths[vertex] = depth;

        for (Integer next : graph.get(vertex)) {
            if (depths[next] == -1) {
                dfs(next, depth + 1);
            }
        }

    }
}
