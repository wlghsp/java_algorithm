package inflearn.Recursive_Tree_Graph_DFS_BFS_기초.q63_경로탐색_인접행렬_DFS;

import java.util.Scanner;

public class Main {

    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;

    public void DFS(int v) {
        if (v == n) answer++;
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {
                    // i를 방문체크하고 DFS(i)를 호출
                    ch[i] = 1;
                    DFS(i);
                    // 뒤로 백할 때 뒤에서 방문할 수 있도록 방문을 취소
                    ch[i] = 0;
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
        graph = new int[n + 1][n + 1];
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1; // 방향그래프이므로 a에서 b로 간다는 의미.
        }
        // 1번 노드 체크
        ch[1] = 1;
        // 1부터 시작
        T.DFS(1);
        System.out.println(answer);

    }
}
