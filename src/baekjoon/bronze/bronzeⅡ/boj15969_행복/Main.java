package baekjoon.bronze.bronzeⅡ.boj15969_행복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            maxVal = Math.max(maxVal, num);
            minVal = Math.min(minVal, num);
        }
        System.out.println(maxVal - minVal);
    }
}
