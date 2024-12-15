package baekjoon.bronze.bronze2.boj3062_수_뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String n = br.readLine();
            String reversedN = new StringBuilder(n).reverse().toString();
            int sum = Integer.parseInt(n) + Integer.parseInt(reversedN);
            System.out.println(isPalindromeNumber(sum) ? "YES" : "NO");
        }
    }

    private static boolean isPalindromeNumber(int sum) {
        String number = String.valueOf(sum);
        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(i) != number.charAt(number.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
