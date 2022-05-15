package baekjoon.bronze.bronzeⅠ.Boj11050_이항계수1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    // 이항계수 풀이에 동적계획법 활용
    /*
    재귀로 서브 문제에 대해 풀 경우 메모이제이션을 하지 않으면 함수의 성능이 매우 떨어지기 때문에
    우리가 이미 풀었던 경우는 메모이제이션을 해주어야 좀 더 효율이 좋은 함수를 만들 수 있다.
     */
    static int N, K;
    static int[][] dp;
    public static int BC(int N, int K) {
        // 이미 풀었던 sub문제일 경우 값을 재활용
        if (dp[N][K] > 0) {
            return dp[N][K];
        }

        // 2번 성질
        if (N == K || K == 0) {
            return dp[N][K] = 1;
        }

        // 1번 성질
        return dp[N][K] = BC(N - 1, K - 1) + BC(N - 1, K);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        dp = new int[N+1][K+1];

        System.out.println(BC(N, K));

    }
}
