package baekjoon.bronze.bronzeⅡ.boj24510_시간복잡도를배운도도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int c = Integer.parseInt(br.readLine());
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < c; i++) {
            String s = br.readLine();
            int cnt = 0;
            int length = s.length();
            String noFor = s.replaceAll("for", "");
            String noWhile = s.replaceAll("while", "");
            cnt = (length - noFor.length()) / 3 + (length - noWhile.length()) / 5;
            maxVal = Math.max(cnt, maxVal);
        }
        System.out.println(maxVal);
    }
}
