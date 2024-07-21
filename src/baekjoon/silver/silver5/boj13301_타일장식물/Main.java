package baekjoon.silver.silver5.boj13301_타일장식물;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver5/boj13301_타일장식물/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] dp = new long[81];
        dp[1] = 4;
        dp[2] = 6;
        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        System.out.println(dp[N]);

    }
}
