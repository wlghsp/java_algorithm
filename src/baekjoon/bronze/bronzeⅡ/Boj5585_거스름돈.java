package baekjoon.bronze.bronzeⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj5585_거스름돈 {
    static int TOTAL = 1000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pay = Integer.parseInt(br.readLine());

        // 500, 100, 50, 10, 5, 1
        int[] arr = new int[]{500, 100, 50, 10, 5, 1};

        // 잔돈
        int change = TOTAL - pay;

        int cnt = 0;
        // 각 동전으로 나누면 몫은 그 동전의 사용갯수, 나눈 나머지는 다시 할당하여 다음 작은 단위의 동전으로 같은 동작 반복
        for (int i = 0; i < arr.length; i++) {
            int divider = change / arr[i];
            cnt += divider;     // 몫은 그 동전의 사용갯수
            change %= arr[i]; // 나눈 나머지를 저장
        }
        System.out.println(cnt);
    }
}
