package baekjoon.bronze.bronzeⅤ.boj25372_성택이의은밀한비밀번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String t = br.readLine();
            int length = t.length();
            if (length >= 6 && length <= 9) System.out.println("yes");
            else System.out.println("no");
        }

    }
}
