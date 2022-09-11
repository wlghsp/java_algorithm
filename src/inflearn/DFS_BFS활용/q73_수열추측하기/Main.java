package inflearn.DFS_BFS활용.q73_수열추측하기;

import java.util.Scanner;

public class Main {

    // b에 조합 값 저장, p에 순열 저장, 순열이므로 체크배열 필요
    static int[] b, p, ch;
    static int n, f;
    boolean flag = false;
    int[][] dy = new int[35][35];
    static StringBuilder sb = new StringBuilder();

    public int combi(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }

    public void DFS(int L, int sum) {
        if (flag) return;
        if (L == n) {
            if (sum == f) {
                for (int x : p) sb.append(x).append(" ");
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i += 1) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i;
                    DFS(L + 1, sum + (p[L] * b[L]));
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        b = new int[n];
        p = new int[n];
        ch = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i] = T.combi(n - 1, i);
        }

        T.DFS(0, 0);
        System.out.println(sb);
    }
}
