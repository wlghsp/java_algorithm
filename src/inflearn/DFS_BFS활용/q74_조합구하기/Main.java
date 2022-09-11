package inflearn.DFS_BFS활용.q74_조합구하기;

import java.util.Scanner;

public class Main {

    /*
    조합 코드는 외우자
     */
    static int[] combi;
    static int n, m;
    static StringBuilder sb = new StringBuilder();

    public void DFS(int L, int s) {
        if (L == m) {
            for(int x : combi) sb.append(x).append(" ");
            sb.append("\n");

        } else {
            for (int i = s; i <= n; i++) { // s는 1부터 시작
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        combi = new int[m];
        T.DFS(0, 1);
        System.out.println(sb);
    }
}
