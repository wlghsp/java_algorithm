package baekjoon.bronze.bronzeⅡ.Boj1225_이상한곱셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        long sum_a = 0;

        for (int i = 0; i < a.length(); i++) {
            sum_a += a.charAt(i) - 48;
        }
        long sum_b = 0;
        for (int i = 0; i < b.length(); i++) {
            sum_b += b.charAt(i) - 48;
        }
        System.out.println(sum_a * sum_b);

    }
}
