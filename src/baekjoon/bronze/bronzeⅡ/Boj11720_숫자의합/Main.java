package baekjoon.bronze.bronzeⅡ.Boj11720_숫자의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int result = 0;
        for (int i = 0; i < N; i++) {
            char c = s.charAt(i);
            result += c - '0';
        }
        System.out.println(result);
    }
}
