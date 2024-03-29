package baekjoon.bronze.bronzeⅢ.boj20053_최소최대2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int maxVal = Integer.MIN_VALUE;
            int minVal = Integer.MAX_VALUE;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num > maxVal) maxVal = num;
                if (num < minVal) minVal = num;
            }
            System.out.printf("%d %d\n", minVal, maxVal);
        }

    }
}
