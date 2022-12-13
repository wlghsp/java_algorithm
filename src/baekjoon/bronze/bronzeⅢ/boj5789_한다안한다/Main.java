package baekjoon.bronze.bronzeⅢ.boj5789_한다안한다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            String s = br.readLine();
            int half = s.length() / 2;
            if (s.charAt(half - 1) == s.charAt(half)) {
                System.out.println("Do-it");
            } else {
                System.out.println("Do-it-Not");
            }
        }

    }
}
