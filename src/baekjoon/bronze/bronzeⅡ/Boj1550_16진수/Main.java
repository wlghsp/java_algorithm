package baekjoon.bronze.bronzeⅡ.Boj1550_16진수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int result = 0;

        for (int i = s.length()-1; i >= 0 ; i--) {
            char ch = s.charAt(i);
            int value;

            if (ch >= '0' && ch <= '9') {
                value = ch - '0';
            } else {
                value = ch - 55;
            }
            result += Math.pow(16, s.length()-i-1) * value;
        }

        System.out.println(result);

    }
}
