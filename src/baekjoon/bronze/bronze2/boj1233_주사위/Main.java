package baekjoon.bronze.bronze2.boj1233_주사위;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s1 = Integer.parseInt(st.nextToken());
        int s2 = Integer.parseInt(st.nextToken());
        int s3 = Integer.parseInt(st.nextToken());

        int[] frequency = new int[s1 + s2 + s3 + 1]; // 각 합계별 빈도 배열

        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                for (int k = 1; k <= s3; k++) {
                    frequency[i + j + k]++; // 합계별 빈도 기록
                }
            }
        }

        int minSum = Integer.MAX_VALUE;
        int maxFrequency = 0;
        // 앞에서부터 최대빈도 sum 구하기 (자동으로 최소 sum이 답이됨)
        for (int sum = 3; sum <= s1 + s2 + s3; sum++) {
            if (frequency[sum] > maxFrequency) {
                maxFrequency = frequency[sum];
                minSum = sum;
            }
        }

        System.out.println(minSum);
    }
}
