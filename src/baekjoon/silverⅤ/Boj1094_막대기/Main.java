package baekjoon.silverⅤ.Boj1094_막대기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int count = 0;

        int stick = 64;

        while (x > 0) {
            // 스틱의 길이가 x보다 크면 절반으로 자르기
            if (stick > x) {
                stick /= 2;
            }
            // 스틱의 길이가 x보다 작으면 풀로 붙인다.
            else {
                count++;
                x -= stick;

            }
        }

        System.out.println(count);
    }
}
