package baekjoon.bronze.bronzeⅡ.boj13410_거꾸로구구단;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] a = new int[K];

        for (int i = 1; i <= K; i++) {
            a[i-1] = Integer.parseInt(new StringBuilder(String.valueOf(N * i)).reverse().toString());
        }

        Arrays.sort(a);
        System.out.println(a[a.length - 1]);
    }
}
