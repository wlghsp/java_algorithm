package inflearn.array_1_2차원배열.q16_피보나치수열;

import java.util.Scanner;

public class Main2 {
    private void solution(int n) {
        int a = 1, b =1, c;
        System.out.print(a + " "+ b +  " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c+ " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        T.solution(n);
    }
}
