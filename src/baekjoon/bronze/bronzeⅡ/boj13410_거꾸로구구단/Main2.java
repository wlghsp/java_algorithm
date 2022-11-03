package baekjoon.bronze.bronzeⅡ.boj13410_거꾸로구구단;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int maxVal = Integer.MIN_VALUE;

        for (int i = 1; i <= K; i++) {
            int base = N * i;
            int reverse = 0;
            while (base != 0) {
                reverse *= 10;
                reverse += base % 10;
                base /= 10;
            }
            maxVal = reverse > maxVal ? reverse : maxVal;
        }

        System.out.println(maxVal);

    }
}
