package baekjoon.silver.silver3.boj13237_binary_tree;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    static int N, root;
    static ArrayList<ArrayList<Integer>> nodes;
    static int[] depths;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver3/boj13237_binary_tree/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N + 1];
        depths = new int[N + 1];
        nodes = new ArrayList<>();

        for (int i = 0; i <= N; i++) {
            nodes.add(new ArrayList<>());
        }

        for (int i = 1; i <= N; i++) {
            int parent = Integer.parseInt(br.readLine());

            if (parent == -1) {
                root = i;
            } else {
                nodes.get(parent).add(i);
            }
        }

        dfs(root, 0);

        String result = Arrays.stream(depths, 1, N + 1)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(System.lineSeparator()));

        System.out.println(result);
    }

    private static void dfs(int node, int height) {
        visited[node] = true;
        depths[node] = height;

        for (Integer next : nodes.get(node)) {
            if (!visited[next]) {
                dfs(next, height + 1);
            }
        }
    }
}
