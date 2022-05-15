package baekjoon.bronze.bronzeⅠ.Boj2748_피보나치수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_Long {

    // Long 타입으로 null로 초기화되므로 계산했는지 판별하는데 편리함.
    static Long[] dp;

    static long fibonacci(int n) {
        // Long 타입이 참조타입이므로 초기값은 null
        // null이면 계산한 적이 없으므로 계산해서 값을 저장한다.
        if (dp[n] == null) {
            dp[n] = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        dp = new Long[N+1];


        dp[0] = 0L;
        dp[1] = 1L;
        System.out.println(fibonacci(N));

    }
}
