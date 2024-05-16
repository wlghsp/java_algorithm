package baekjoon.bronze.bronze2.boj15829_Hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        long M = 1234567891;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long result = 0;
        long pow = 1;
        for (int i = 0; i < L; i++) {
            result += ((str.charAt(i) - 96) * pow);
            pow = (pow * 31) % M;
        }

        System.out.println(result % M);
    }
}
