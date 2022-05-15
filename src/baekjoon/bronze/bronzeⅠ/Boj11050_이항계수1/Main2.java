package baekjoon.bronze.bronzeⅠ.Boj11050_이항계수1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

    // Binomial coefficient(이항계수) 성질을 이용한 풀이

    public static int BC(int N, int K) {
       // factorial(0) == 1이다.
        if (N ==K || K == 0) {
            return 1;
        }

        return BC(N-1, K-1) + BC(N-1, K);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(BC(N,K));

    }
}
