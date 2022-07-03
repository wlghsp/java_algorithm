package inflearn.array_1_2차원배열.q15_가위바위보;

import java.util.Scanner;

public class Main {
    private void solution(int n, int[] a, int[] b) {
        StringBuilder sb = new StringBuilder();
        // 두 값의 차이를 이용하여 구함.
        for (int i = 0; i < n; i++) {
            int num = a[i] - b[i];
            if (num == 1 || num == -2){
                sb.append("A\n");
            } else if (num == 2 || num == -1) {
                sb.append("B\n");
            } else if (num == 0) {
                sb.append("D\n");
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Main T = new Main();
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
