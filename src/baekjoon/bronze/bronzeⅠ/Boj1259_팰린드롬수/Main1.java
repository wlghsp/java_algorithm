package baekjoon.bronze.bronzeⅠ.Boj1259_팰린드롬수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {
    private static String recursion(String s, int l, int r) {
        if (l >= r) return "yes";
        if (s.charAt(l) != s.charAt(r)) return "no";
        return recursion(s, l + 1, r - 1);
    }

    public static String isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String num = br.readLine();
            if ("0".equals(num)) break;
            sb.append(isPalindrome(num)).append("\n");
        }
        System.out.println(sb);
    }
}
