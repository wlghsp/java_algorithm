package baekjoon.silver.silver1.boj15723_n단논법;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Map<Character, List<Character>> graph = new HashMap<>();
    static Set<Character> visited;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver1/boj15723_n단논법/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 그래프 초기화
        for (char c = 'a'; c <= 'z'; c++) {
            graph.put(c, new ArrayList<>());
        }

        for (int i = 0; i < N; i++) {
            String[] premise = br.readLine().split(" ");
            char from = premise[0].charAt(0);
            char to = premise[2].charAt(0);
            graph.get(from).add(to);
        }
        int M = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            String[] query = br.readLine().split(" ");
            char from = query[0].charAt(0);
            char to = query[2].charAt(0);

            visited = new HashSet<>();
            if (dfs(from, to)) {
                sb.append("T\n");
            } else {
                sb.append("F\n");
            }
        }

        System.out.println(sb);

    }

    private static boolean dfs(char start, char goal) {
        if (start == goal) return true;

        visited.add(start);
        for (Character next : graph.get(start)) {

            if (visited.contains(next)) continue;
            if (!dfs(next, goal)) continue;

            return true;
        }

        return false;
    }
}
