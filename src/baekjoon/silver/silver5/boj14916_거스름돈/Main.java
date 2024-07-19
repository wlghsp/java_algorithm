package baekjoon.silver.silver5.boj14916_거스름돈;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver5/boj14916_거스름돈/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int ans = 0;

        while (true) {
            // 5로 완전히 나눠질때까지 계속 -2를 하며 카운트한다.
            if (N % 5 == 0) {
                ans += N / 5;
                System.out.println(ans);
                break;
            } else {
                N -= 2;
                ans++;
            }

            if (N < 0) { // 0 미만이 된다면 완벽하게 거슬러 줄 수 없으므로 -1 반환
                System.out.println(-1);
                break;
            }
        }
    }
}
