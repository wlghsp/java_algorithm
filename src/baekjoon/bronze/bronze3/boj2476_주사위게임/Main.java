package baekjoon.bronze.bronze3.boj2476_주사위게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int totalPrize;
        StringTokenizer st;
        int maxPrize = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == b && b == c) {
                totalPrize = 10000 + a * 1000;
            } else if (a == b || b == c || c == a) {
                if (a == b) {
                    totalPrize = 1000 + a * 100;
                } else if (a == c) {
                    totalPrize = 1000 + c * 100;
                } else {
                    totalPrize = 1000 + b * 100;
                }
            } else {
                int max = Math.max(a, b);
                max = Math.max(max, c);
                totalPrize = max * 100;
            }
            maxPrize = Math.max(maxPrize, totalPrize);
        }

        System.out.println(maxPrize);
    }
}
