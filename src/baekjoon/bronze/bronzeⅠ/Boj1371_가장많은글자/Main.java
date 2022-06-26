package baekjoon.bronze.bronzeⅠ.Boj1371_가장많은글자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    // https://mygumi.tistory.com/236
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alphabet = new int[26];
        String str = "";
        while ((str = br.readLine()) != null) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    alphabet[str.charAt(i) - 'a']++;
                }
            }
        }

        int maxVal = Integer.MIN_VALUE;
        for (int i : alphabet) {
            if (maxVal < i) {
                maxVal = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alphabet.length; i++) {

            if (alphabet[i] == maxVal) {
                sb.append((char)(i + 97));
            }
        }
        System.out.println(sb);

    }
}
