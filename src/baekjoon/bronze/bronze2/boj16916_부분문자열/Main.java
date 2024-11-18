package baekjoon.bronze.bronze2.boj16916_부분문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String p = br.readLine();
        System.out.println(s.contains(p) ? "1" : "0");
    }
}
