package baekjoon.bronze.bronzeⅠ.Boj2748_피보나치수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] fibo = new long[91];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < 91; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        int n = Integer.parseInt(br.readLine());
        System.out.println(fibo[n]);
    }
}
