package baekjoon.silverⅢ.boj1003_피보나치함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final int MAX_N = 40;

    static Long[] dp;

    static int T;

    static Long fibonacci(int n) {
        if (dp[n] == null) {
            dp[n] = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int cnt1 = 0, cnt0 = 0;
            int n = Integer.parseInt(br.readLine());
            dp = new Long[MAX_N + 1];
            dp[0] = 0L;
            dp[1] = 1L;
            fibonacci(n);
            for (int j = 0; j < n; j++) {
                if(dp[j] == 0L) cnt0++;
                else if (dp[j] == 1L) cnt1++;
            }
            System.out.printf("%d %d\n", cnt0, cnt1);
        }

    }
}
