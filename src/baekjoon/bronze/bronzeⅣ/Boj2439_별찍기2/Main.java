package baekjoon.bronze.bronzeⅣ.Boj2439_별찍기2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < N + 1; i++) {
            for (int j = N - i; j > 0 ; j-= 1) {
                sb.append(' ');
            }
            for (int j = 0; j < i; j++) {
                sb.append('*');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
