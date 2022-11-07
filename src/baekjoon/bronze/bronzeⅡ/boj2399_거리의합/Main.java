package baekjoon.bronze.bronzeⅡ.boj2399_거리의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] points = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            points[i] = Integer.parseInt(st.nextToken());
        }
        long sum = 0;
        for (int i = 0; i < N; i++) {
            int tmp = points[i];
            for (int j = 0; j < N; j++) {
                sum += Math.abs(tmp - points[j]);
            }
        }
        System.out.println(sum);
    }
}
