package baekjoon.bronze.bronzeⅡ.boj18238_ZOAC2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char start = 'A';
        int time = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int temp = Math.abs(c - start);
            time += Math.min(temp, 26 - temp);
            start = c;
        }
        System.out.println(time);
    }
}