package baekjoon.bronze.bronzeⅢ.boj8932_7종경기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int score = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            double[] arr = new double[7];
            for (int j = 0; j < 7; j++) {
                arr[j] = Double.parseDouble(st.nextToken());
            }
            score += 9.23076 * Math.pow(26.7 - arr[0], 1.835); // 100미터 허들
            score += 4.99087 * Math.pow(42.5 - arr[3], 1.81);
            score += 0.11193 * Math.pow(254 - arr[6], 1.88);

            score += 1.84523 * Math.pow(arr[1] - 75, 1.348);
            score += 56.0211 * Math.pow(arr[2] - 1.5, 1.05);
            score += 0.188807 * Math.pow(arr[4] - 210, 1.41);
            score += 15.9803 * Math.pow(arr[5] - 3.8, 1.04);
            System.out.println(score);
        }
    }
}
