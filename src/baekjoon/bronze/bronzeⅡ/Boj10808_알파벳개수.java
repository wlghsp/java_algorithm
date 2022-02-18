package baekjoon.bronze.bronzeⅡ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj10808_알파벳개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] alphabets = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i) - 97;
            alphabets[a]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < alphabets.length; i++) {
            sb.append(alphabets[i] + " ");
        }
        System.out.println(sb);
    }
}
