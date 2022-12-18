package baekjoon.bronze.bronzeⅢ.boj5724_파인만;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] cnt = new int[101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        cnt[1] = 1;
        cnt[2] = 5;
        for (int i = 3; i <= 100; i++) {
            cnt[i] = cnt[i - 1] + (i * i);
        }
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            System.out.println(cnt[n]);
        }
    }
}
