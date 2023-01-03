package baekjoon.bronze.bronzeⅡ.boj2495_연속구간;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            String s = br.readLine();
            System.out.println(consecutiveNumCnt(s));
        }
    }

    public static int consecutiveNumCnt(String s) {
        int cnt = 1;
        int maxVal = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                cnt++;
            } else {
                cnt = 1;
            }
            maxVal = Math.max(cnt, maxVal);
        }
        return maxVal;
    }
}
