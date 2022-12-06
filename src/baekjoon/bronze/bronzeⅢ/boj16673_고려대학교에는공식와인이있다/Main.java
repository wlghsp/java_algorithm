package baekjoon.bronze.bronzeⅢ.boj16673_고려대학교에는공식와인이있다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int c = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int sum = 0;
        for (int i = 1; i <= c; i++) {
            sum += k * i + p * Math.pow(i, 2);
        }
        System.out.println(sum);

    }
}
