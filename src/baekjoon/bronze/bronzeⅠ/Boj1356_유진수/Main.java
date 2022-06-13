package baekjoon.bronze.bronzeⅠ.Boj1356_유진수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();

        int n_len = num.length();
        boolean found = false;
        for (int i = 0; i < n_len - 1; i++) {
            int left = 1, right = 1;

            for (int j = 0; j < i + 1; j++) {
                left *= (num.charAt(j) - '0');
            }
            for (int j = i+1; j < n_len; j++) {
                right *= (num.charAt(j) - '0');
            }
            if (left == right) {
                System.out.println("YES");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("NO");
        }

    }
}
