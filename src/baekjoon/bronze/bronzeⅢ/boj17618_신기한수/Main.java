package baekjoon.bronze.bronzeⅢ.boj17618_신기한수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            // 스트림으로 숫자의 자릿수 합 구하기
//            int sum = String.valueOf(i).chars().map(k -> k - 48).sum();
            int sum = getSum(i);
            if (i %  sum == 0) cnt++;
        }
        System.out.println(cnt);
    }
    private static int getSum(int num) {
        int result = 0;
        while (num != 0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }
}
