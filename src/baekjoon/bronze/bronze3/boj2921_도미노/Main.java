package baekjoon.bronze.bronze3.boj2921_도미노;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        /*
        숫자 N까지 j와 i와 같아질 때 까지 j 와 i를 계속 더함
         */
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= i; j++) {
                sum += (i + j);
            }
        }

        System.out.println(sum);
    }
}
