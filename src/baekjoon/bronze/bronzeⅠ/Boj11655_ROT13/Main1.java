package baekjoon.bronze.bronzeⅠ.Boj11655_ROT13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {

    static final int ROT13 = 13;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        for (int i = 0; i < arr.length; i++) arr[i] = decrypt(arr[i]);
        System.out.println(String.join(" ", arr));
    }

    private static String decrypt(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('A' <= c && c <= 'Z') {
                result.append((char) (c + ROT13 > 'Z' ? c - 26 + ROT13 : c + ROT13));
            } else if ('a' <= c && c <= 'z') {
                result.append((char) (c + ROT13 > 'z' ? c - 26 + ROT13 : c + ROT13));
            } else if ('0' <= c && c <= '9') {
                result.append(c);
            }
        }
        return result.toString();
    }
}
