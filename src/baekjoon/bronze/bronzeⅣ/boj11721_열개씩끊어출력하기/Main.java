package baekjoon.bronze.bronzeⅣ.boj11721_열개씩끊어출력하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                if (j != 0 && j % 10 == 0) sb.append("\n");
                sb.append(s.charAt(j));
            }
        System.out.println(sb);
    }
}
