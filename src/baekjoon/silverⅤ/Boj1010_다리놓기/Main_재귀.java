package baekjoon.silverⅤ.Boj1010_다리놓기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_재귀 {

    static int[][] dp = new int[30][30];

    static int BC(int N, int K) {
        if (dp[N][K] > 0) {
            return dp[N][K];
        }

        if (N==K || K == 0) {

            return dp[N][K] = 1;
        }

        return dp[N][K] = BC(N - 1, K - 1) + BC(N - 1, K);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
//            dp = new int[30][30]; // 같은 숫자일 경우에는 미리 값을 구해놓는 것이므로 초기화할 필요 없다.
            sb.append(BC(m, n)).append('\n');
        }
        System.out.println(sb);
    }
}
