package baekjoon.bronze.bronzeⅢ.boj10987_모음의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if ("aeiou".contains(s.charAt(i) + "") ) cnt++;
        }
        System.out.println(cnt);
    }
}
