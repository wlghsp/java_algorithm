package baekjoon.bronze.bronzeⅢ.boj14579_덧셈과곱셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final int MOD = 14579;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int tmp = a * (a + 1) / 2;
        tmp %= MOD;
        int result = tmp;
        for (int i = a+1; i <= b; i++) {
            result *= (tmp+=i);
            result %= MOD;
        }
        System.out.println(result);
    }
}
