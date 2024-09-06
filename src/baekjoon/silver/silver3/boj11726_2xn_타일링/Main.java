package baekjoon.silver.silver3.boj11726_2xn_타일링;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver3/boj11726_2xn_타일링/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] cnt = new int[N + 1];
        cnt[1] = 1;
        if (N > 1) {
            cnt[2] = 2;
        }

        for (int i = 3; i <= N; i++) {
            cnt[i] = (cnt[i - 1] + cnt[i - 2]) % 10007;
        }

        System.out.println(cnt[N]);
    }
}
