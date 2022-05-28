package baekjoon.silverⅢ.Boj2606_바이러스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static int N, edge;
    static int count = 0;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    public static void dfs(int x){
        visited[x] = true;
        count++;
        for (int value : graph.get(x)) {
            if (!visited[value]) {
                dfs(value);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        edge = Integer.parseInt(br.readLine());

        visited = new boolean[N + 1];

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        StringTokenizer st;

        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph.get(x).add(y);
            graph.get(y).add(x);
        }


        for (int i = 0; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        dfs(1);

        // 1번 컴퓨터는 제외해야 하므로 -1을 해준다.
        System.out.println(count - 1);

    }
}
