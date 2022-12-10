package goorm_level.난이도1.정사각형의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        long cnt = 0;
        for (long i = 1; i <= N; i++) {
            cnt += i * i;
        }
        System.out.println(cnt);
    }
}
