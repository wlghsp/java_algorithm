package baekjoon.bronze.bronzeⅠ.Boj10798_세로읽기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder[] arr = new StringBuilder[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new StringBuilder();
        }
        for (int i = 0; i < 5; i++) {
            String t = br.readLine();
            for (int k = 0; k < t.length(); k++) {
                arr[k].append(t.charAt(k));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (StringBuilder s : arr) {
            if (s.length() > 0) sb.append(s);
        }
        System.out.println(sb);
    }
}
