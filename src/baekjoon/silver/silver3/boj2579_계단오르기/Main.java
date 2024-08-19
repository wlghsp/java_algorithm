package baekjoon.silver.silver3.boj2579_계단오르기;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N;
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver3/boj2579_계단오르기/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        long[] scores = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            int score = Integer.parseInt(br.readLine());
            scores[i] = score;
        }
        long[] dp = new long[N + 1];

        dp[1] = scores[1];
        if (N >= 2) {
            dp[2] = scores[1] + scores[2];
        }

        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i - 2] + scores[i], dp[i - 3] + scores[i - 1] + scores[i]);
        }

        System.out.println(dp[N]);

    }
}
