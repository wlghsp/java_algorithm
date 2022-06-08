package baekjoon.bronze.bronzeⅠ.Boj11655_ROT13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sen = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sen.length(); i++) {
            char c = sen.charAt(i);
            if (Character.isAlphabetic(c)) {
                if (Character.isUpperCase(c)) {
                    int num = c;
                    char ch = (char) ((((num - 65) + 13) % 26) + 65);
                    sb.append(ch);
                } else {
                    int num = c;
                    char ch = (char) ((((num - 97) + 13) % 26) + 97);
                    sb.append(ch);
                }
            } else {
                sb.append(c);
            }
        }

        System.out.println(sb);


    }
}
