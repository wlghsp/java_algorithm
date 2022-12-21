package baekjoon.bronze.bronzeⅢ.boj14568_2017연세대학교프로그래밍경시대회;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int a = 2; a <= N - 2; a += 2) {
            for (int b = 1; b <= N - 2; b++) {
                for (int c = b + 2; c <= N - 2; c++) {
                    if (N == a + b + c) cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}
