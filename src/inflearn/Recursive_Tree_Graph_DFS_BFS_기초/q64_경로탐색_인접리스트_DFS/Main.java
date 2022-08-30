package inflearn.Recursive_Tree_Graph_DFS_BFS_기초.q64_경로탐색_인접리스트_DFS;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // 인접행렬은 정점이 많아질수록 비효율적임
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public void DFS(int v) {
        if (v == n) answer++;
        else {
            for (int nv : graph.get(v)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        // 1~n번 인덱스까지 정점번호를 의미하므로 n + 1
        graph = new ArrayList<>();
        // 인접리스트는 객체를 생성해야함
        for (int i = 0; i <= n; i++) { // n + 1
            graph.add(new ArrayList<>());
        }
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b); // 방향그래프이므로 a에서 b로 간다는 의미.
        }
        // 1번 노드 체크
        ch[1] = 1;
        // 1부터 시작
        T.DFS(1);
        System.out.println(answer);

    }
}
