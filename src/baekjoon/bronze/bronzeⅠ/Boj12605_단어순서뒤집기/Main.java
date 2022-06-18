package baekjoon.bronze.bronzeⅠ.Boj12605_단어순서뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb;
        for (int i = 0; i < N; i++) {
            String[] sen = br.readLine().split(" ");
            sb = new StringBuilder();
            for (int j = sen.length -1; j >= 1; j--) {
                sb.append(sen[j]).append(" ");
            }
            sb.append(sen[0]);
            System.out.printf("Case #%d: %s\n", i+1, sb);
        }
    }
}
