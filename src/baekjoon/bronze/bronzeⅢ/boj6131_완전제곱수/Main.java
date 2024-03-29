package baekjoon.bronze.bronzeⅢ.boj6131_완전제곱수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int b = 1; b <= 500; b++) {
            for (int a = b; a <= 500; a++) {
                if (a * a == (b * b + N)) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
