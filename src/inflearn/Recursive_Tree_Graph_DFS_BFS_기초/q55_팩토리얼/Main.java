package inflearn.Recursive_Tree_Graph_DFS_BFS_기초.q55_팩토리얼;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private int DFS(int n) {
        if (n == 1) return 1;
        else return n * DFS(n - 1);
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main T = new Main();
        System.out.println(T.DFS(5));

    }
}
