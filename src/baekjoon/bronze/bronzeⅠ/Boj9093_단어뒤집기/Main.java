package baekjoon.bronze.bronzeⅠ.Boj9093_단어뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb;
        for (int i = 0; i < T; i++) {
            String[] strs = br.readLine().split(" ");
            sb = new StringBuilder();
            for (String s : strs) {
                StringBuilder sb1 = new StringBuilder(s);
                sb.append(sb1.reverse()).append(' ');
            }
            System.out.println(sb);
        }
    }
}
