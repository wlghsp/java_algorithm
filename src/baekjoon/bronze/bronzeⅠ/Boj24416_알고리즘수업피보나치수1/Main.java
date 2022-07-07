package baekjoon.bronze.bronzeⅠ.Boj24416_알고리즘수업피보나치수1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int fibCnt;
    static int fibonacciCnt;
    static int[] f;

    public static int fib(int n) {

        if (n == 1 || n == 2) return 1;
        else {
            fibCnt++;
            return (fib(n - 1) + fib(n - 2));
        }
    }
    public static int fibonacci(int n) {
        f[1] = f[2] = 1;

        for (int i = 3; i <= n; i++) {
            fibonacciCnt++;
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fibCnt = 1;
        fibonacciCnt = 0;
        f = new int[n + 1];
        fib(n);
        fibonacci(n);
        System.out.println(fibCnt + " " + fibonacciCnt);
    }
}
