package inflearn.Recursive_Tree_Graph_DFS_BFS_기초.q54_이진수출력_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static String result = "";
    private void solution(int N) {
        if (N == 0) {
            return;
        } else {
            solution(N/2);
            result += String.valueOf(N % 2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Main T = new Main();
        T.solution(N);
        System.out.println(result);
    }
}
