package baekjoon.bronze.bronzeⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj10820_문자열분석 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 소문자 대문자 숫자 공백
        String str = "";

        while ((str = br.readLine()) != null) {
            int lower = 0, upper = 0, number = 0, blank = 0;

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if ('A' <= c && c <= 'Z') { // 대문자 범위
                    upper++;
                } else if('a' <= c && c <= 'z') {  // 소문자 범위
                    lower++;
                } else if (c == ' '){
                    blank++;
                } else {
                    number++;
                }
            }

            System.out.printf("%d %d %d %d\n", lower, upper, number, blank);
        }
    }
}
