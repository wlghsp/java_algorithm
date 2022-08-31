package inflearn.DFS_BFS활용.q68_최대점수구하기_DFS;

import java.util.Scanner;

public class Main {
    static int answer = Integer.MIN_VALUE, n, m;

    public void DFS(int L, int scoreSum,int timeSum, int[][] prob) {
        if (timeSum > m) return;
        if (L == n) {
            answer = Math.max(answer, scoreSum);
        } else {
            DFS(L + 1, scoreSum + prob[L][0], timeSum + prob[L][1], prob);
            DFS(L + 1, scoreSum, timeSum, prob);
        }
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 문제의 갯수 n
        m = sc.nextInt(); // 제한 시간
        int[][] prob = new int[n][2];
        for (int i = 0; i < n; i++) {
            prob[i][0] = sc.nextInt();
            prob[i][1] = sc.nextInt();
        }
        T.DFS(0, 0, 0, prob);
        System.out.println(answer);
    }
}
