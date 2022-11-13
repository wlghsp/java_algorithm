package baekjoon.bronze.bronzeⅡ.boj10820_문자열분석;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        StringBuilder sb = new StringBuilder();
        while ((s = br.readLine()) != null) {
            int lowerCase = 0;
            int upperCase = 0;
            int num = 0;
            int blank = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isLowerCase(c)) lowerCase++;
                else if (Character.isUpperCase(c)) upperCase++;
                else if (Character.isDigit(c)) num++;
                else if (c == ' ') blank++;
            }
            sb.append(lowerCase).append(" ").append(upperCase).append(" ").append(num).append(" ").append(blank).append("\n");
        }

        System.out.println(sb);

    }
}
