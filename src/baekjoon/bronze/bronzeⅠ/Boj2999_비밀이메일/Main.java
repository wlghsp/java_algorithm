package baekjoon.bronze.bronzeⅠ.Boj2999_비밀이메일;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String message = br.readLine();
        int length = message.length();
        int R = 1, C = message.length();
        char[] chars = message.toCharArray();
        for (int i = 2; i < message.length(); i++) {
            if (i * i > message.length()) break;
            if (length % i == 0) {
                R = i;
                C = length / i;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                sb.append(chars[j * R + i]);
            }
        }
        System.out.println(sb);

    }

}

