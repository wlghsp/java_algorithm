package inflearn.q15_가위바위보;

import java.util.Scanner;

public class Main2 {
    private void solution(int n, int[] a, int[] b) {
        StringBuilder sb = new StringBuilder();
        // 비기거나  A가이기는 경우를 제외하면 전부 B가 이기는 경우로 짧게 줄임
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) sb.append("D\n");
            else if(a[i] == 3 && b[i] == 2) sb.append("A\n");
            else if(a[i] == 2 && b[i] == 1) sb.append("A\n");
            else if(a[i] == 1 && b[i] == 3) sb.append("A\n");
            else sb.append("B\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        T.solution(n, a, b);
    }
}
