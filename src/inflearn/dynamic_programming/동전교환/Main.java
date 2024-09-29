package inflearn.dynamic_programming.동전교환;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] coins, dp;

    public static int solution() {
        dp[0] = 0;
        for (int i = 0; i < N; i++) {
            for (int j = coins[i]; j <= M; j++) {
                dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
            }
        }
        return dp[M] == Integer.MAX_VALUE ? -1 : dp[M];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        coins = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(st.nextToken());
        }
        M = Integer.parseInt(br.readLine());
        dp = new int[M + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        System.out.println(solution());
    }
}
