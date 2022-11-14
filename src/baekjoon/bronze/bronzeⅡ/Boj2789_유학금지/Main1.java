package baekjoon.bronze.bronzeⅡ.Boj2789_유학금지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (!"CAMBRIDGE".contains(s.charAt(i) + "")) result += s.charAt(i);
        }
        System.out.println(result);
    }
}
