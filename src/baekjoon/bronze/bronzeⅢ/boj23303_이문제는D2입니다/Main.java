package baekjoon.bronze.bronzeⅢ.boj23303_이문제는D2입니다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s.contains("d2") || s.contains("D2")) System.out.println("D2");
        else System.out.println("unrated");
    }
}
