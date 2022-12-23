package baekjoon.bronze.bronzeⅢ.boj11648_지속;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        int n = Integer.parseInt(br.readLine());

        while (n >= 10) {
            n = processNum(n);
            cnt++;
        }
        System.out.println(cnt);

    }

    private static int processNum(int n) {
        int result = 1;
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            result *= s.charAt(i) - 48;
        }
        return result;
    }
}
