package baekjoon.silverⅡ.boj11053_가장긴증가하는부분수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static final int MAX_N = 1000;
    static int N;
    static int[] arr = new int[MAX_N + 1];
    static int[] dp = new int[MAX_N + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = 1;
        for (int i = 1; i < N; i++) {
            int val = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    if(val < dp[j]) val = dp[j];
                }
            }
            dp[i] = val + 1;
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (ans < dp[i]) ans = dp[i];
        }
        System.out.println(ans);
    }
}
