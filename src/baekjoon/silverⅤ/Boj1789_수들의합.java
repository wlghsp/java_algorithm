package baekjoon.silverⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * idea
 * 서로 다른 자연수 N개의 자연수의 합이고 N의 최댓값을 구하는 문제로
 * 1 부터 증가 시키면서 더하고 count를 같이 증가 시켜준다.
 * S를 넘으면 거기서 중단하고 count에서 -1을 뺀 값이 N의 최댓값이다.
 */

public class Boj1789_수들의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        int count = 0;
        int sum = 0;
        int i = 1;
        while (s > sum) {
            sum += i;
            i++;
            count++;
        }
        System.out.println(count - 1);
    }
}
