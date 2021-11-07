package java_study.dfs;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/*
5 6
0 1 0 2 1 3 1 4 2 4 3 4

인접행렬로 풀이

*/

public class DFS_youtubeEx1 {

    static final int MAX_N = 10;
    static int N, E;
    static int[][] Graph = new int[MAX_N][MAX_N];
    // static boolean[] visited = new boolean[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        E = sc.nextInt();

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            Graph[u][v] = Graph[v][u] = 1;
        }
        System.out.println(Arrays.deepToString(Graph));
        // dfs_recur(0);
        dfs_stack(0);
    }

    // 1. 재귀적으로 구현한 DFS
    // static void dfs_recur(int node) {
    // visited[node] = true;
    // System.out.print(node + " ");

    // for (int next = 0; next < N; next++) {
    // if (!visited[next] && Graph[node][next] != 0) {
    // dfs_recur(next);
    // }
    // }
    // }

    // 2. stack을 이용한 DFS
    static void dfs_stack(int node) {
        boolean[] visited = new boolean[MAX_N];

        Stack<Integer> mystack = new Stack<>();
        mystack.push(node);

        while (!mystack.empty()) {
            int curr = mystack.pop();

            if (visited[curr])
                continue;

            visited[curr] = true;
            System.out.print(curr + " ");

            for (int next = 0; next < N; next++) {
                if (!visited[next] && Graph[curr][next] != 0) {
                    mystack.push(next);
                }
            }
        }
    }

}
