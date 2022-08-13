package baekjoon.bronze.bronzeⅢ.Boj2953_나는요리사다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxIdx = 0;
        int maxVal = Integer.MIN_VALUE;
        StringTokenizer st;
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());
            int three = Integer.parseInt(st.nextToken());
            int four = Integer.parseInt(st.nextToken());
            int total = one + two + three + four;
            if (maxVal< total) {
                maxIdx = i+1;
                maxVal = total;
            }
        }
        System.out.println(maxIdx + " " + maxVal);
    }
}
