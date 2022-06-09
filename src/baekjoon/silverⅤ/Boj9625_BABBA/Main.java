package baekjoon.silverⅤ.Boj9625_BABBA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int[] a = new int[K+1];
        int[] b = new int[K+1];
        a[0] = 1;
        a[1] = 0;
        b[0] = 0;
        b[1] = 1;
        for (int i = 2; i < K + 1; i++) {
            a[i] = a[i - 1] + a[i - 2];
            b[i] = b[i - 1] + b[i - 2];
        }
        System.out.println(a[K] + " " + b[K]);
    }
}
