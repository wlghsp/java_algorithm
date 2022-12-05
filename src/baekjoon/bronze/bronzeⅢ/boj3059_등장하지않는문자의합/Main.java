package baekjoon.bronze.bronzeⅢ.boj3059_등장하지않는문자의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int[] alpha = new int[26];
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                alpha[c-65]++;
            }
            int sum = 0;
            for (int k = 0; k < alpha.length; k++) {
                if (alpha[k] == 0) {
                    sum += k + 65;
                }
            }
            System.out.println(sum);
        }
    }
}
