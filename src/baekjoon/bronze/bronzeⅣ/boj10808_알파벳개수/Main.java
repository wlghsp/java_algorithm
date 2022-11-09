package baekjoon.bronze.bronzeⅣ.boj10808_알파벳개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alpha = new int[26];
        String s = br.readLine();
        for (char c : s.toCharArray()) alpha[c - 97]++;
        StringBuilder sb = new StringBuilder();
        for (int i : alpha) sb.append(i).append(" ");
        if (sb.length() > 1) sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
