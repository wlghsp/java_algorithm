package baekjoon.silverⅤ.boj2018_수들의합5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 1;
        int left = 1;
        int right = 1;
        int sum = 1;

        while (right != N) {
            if (sum == N) {
                cnt++;
                right++;
                sum += right;
            } else if (sum > N) {
                sum -= left;
                left++;
            } else {
                right++;
                sum += right;
            }
        }

        System.out.println(cnt);

    }
}
