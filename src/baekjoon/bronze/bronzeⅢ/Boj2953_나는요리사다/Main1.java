package baekjoon.bronze.bronzeⅢ.Boj2953_나는요리사다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int maxVal = Integer.MIN_VALUE;
        int result = 0;
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += Integer.parseInt(st.nextToken());
            }
            if (sum > maxVal) {
                maxVal = sum;
                result = i + 1;
            }
        }
        System.out.println(result + " " + maxVal);
    }
}
