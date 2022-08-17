package inflearn.Recursive_Tree_Graph_DFS_BFS_기초.q54_이진수출력_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Main {

    private void DFS(int N) {
        if (N == 0) {
            return;
        } else {
            DFS(N/2);
            System.out.print(N%2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main T = new Main();
        T.DFS(11);
    }
}
