package baekjoon.bronze.bronzeⅣ.boj13985_Equality;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n1 = s.charAt(0) - '0';
        int n2 = s.charAt(4) - '0';
        int n3 = s.charAt(8) - '0';
        System.out.println(n1 + n2 == n3 ? "YES" : "NO");
    }
}
