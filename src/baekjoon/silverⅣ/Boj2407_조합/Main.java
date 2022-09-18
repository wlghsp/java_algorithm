package baekjoon.silverⅣ.Boj2407_조합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    BigInteger[][] memo = new BigInteger[101][101];

    public BigInteger DFS(int n, int m) {
        if (memo[n][m] != null) return memo[n][m];
        if (n==m || m==0) return BigInteger.valueOf(1);
        else return memo[n][m] = DFS(n - 1, m - 1).add(DFS(n - 1, m));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Main T = new Main();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        System.out.println(T.DFS(n, m));

    }
}
