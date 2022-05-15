package baekjoon.bronze.bronzeⅠ.Boj11050_이항계수1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1 {

    // factorial로 조합 공식 구현하는 풀이

    public static int factorial(int N) {
       // factorial(0) == 1이다.
        if (N <= 1) {
            return 1;
        }

        return N * factorial(N - 1);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        System.out.println(factorial(N)/ ((factorial(K)) * factorial(N-K)));

    }
}
