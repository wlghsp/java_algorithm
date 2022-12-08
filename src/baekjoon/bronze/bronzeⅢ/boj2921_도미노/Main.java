package baekjoon.bronze.bronzeⅢ.boj2921_도미노;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                sum = sum + i + j;
            }
        }
        System.out.println(sum);
    }
}
