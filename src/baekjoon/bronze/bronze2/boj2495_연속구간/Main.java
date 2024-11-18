package baekjoon.bronze.bronze2.boj2495_연속구간;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            String nums = br.readLine();
            System.out.println(getConsecutiveNumsLength(nums));
        }
    }

    private static int getConsecutiveNumsLength(String nums) {
        int max = 1;
        int lengths = 1;
        for (int i = 0; i < nums.length() - 1; i++) {
            if (nums.charAt(i) == nums.charAt(i + 1)) {
                lengths++;
                max = Math.max(max, lengths);
            } else {
                lengths = 1;
            }
        }
        return max;
    }
}
