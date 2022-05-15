package baekjoon.bronze.bronzeⅠ.Boj2748_피보나치수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_재귀 {

    static long[] dp;

    static long fibonacci(int n) {
        if (dp[n] == -1) {
            dp[n] = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        dp = new long[N+1];
        for (int i = 0; i < N+1; i++) {
            dp[i] = -1;
        }

        dp[0] = 0;
        dp[1] = 1;
        System.out.println(fibonacci(N));

    }
}
