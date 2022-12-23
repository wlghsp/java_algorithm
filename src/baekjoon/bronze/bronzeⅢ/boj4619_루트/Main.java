package baekjoon.bronze.bronzeⅢ.boj4619_루트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            if (b == 0 && n == 0) break;
            int minDiff = Integer.MAX_VALUE;
            int minVal = Integer.MAX_VALUE;
            for (int a = 1; Math.pow(a, n) < 2000000; a++) {
                int diff = (int) Math.abs(Math.pow(a, n) - b);
                if (diff < minDiff) {
                    minDiff = diff;
                    minVal = a;
                }
            }
            System.out.println(minVal);
        }
    }
}
