package baekjoon.bronze.bronzeⅢ.boj2721_삼각수의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            for (int k = 1; k <= n; k++) {
                sum += k * ((k+1) * (k + 2) / 2);
            }
            System.out.println(sum);
        }
    }
}
