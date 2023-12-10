package programmers.level2.피보나치수;

import java.util.Arrays;

public class Solution {
    private final int[] mem = new int[100001];

    private int fibonacci(int n) {
        if (mem[n] != -1) return mem[n];
        if (n == 0 || n == 1) return n;

        return mem[n] = (fibonacci(n - 1) + fibonacci(n -2)) % 1234567;
    }
    public int solution(int n) {
        Arrays.fill(mem, -1);
        for (int i = 0; i <= n; i++) {
            fibonacci(n);
        }
        return fibonacci(n);
    }

    /**
     * dp공간을 사용하지 않고 변수 2개로 구하는 방식
     */
    public int solution2(int n) {
        int answer = 0;
        int f1 = 0, f2 = 1;
        for (int i = 2; i <= n; i++) {
            answer = (f1 + f2) % 1234567;
            f1 = f2;
            f2 = answer;
        }

        return answer;
    }

    /**
     * dp 배열 활용 풀이
     */
    public int solution1(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }

        return dp[n];
    }
}
