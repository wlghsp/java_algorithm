package baekjoon.bronze.bronzeⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj4344_평균은넘겠지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(br.readLine());
        double[] douArr = new double[C];
        StringTokenizer st;
        for (int i = 0; i < C; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int sum = 0;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(st.nextToken());
                sum += num;
                arr[j] = num;
            }
            double average = sum/(double)n;
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] > average) {
                    cnt++;
                }
            }
            douArr[i] = cnt/(double)n * 100.0;
        }

        for (int i = 0; i < douArr.length; i++) {
            System.out.println(String.format("%.3f", douArr[i]) + "%");
        }

    }
}
