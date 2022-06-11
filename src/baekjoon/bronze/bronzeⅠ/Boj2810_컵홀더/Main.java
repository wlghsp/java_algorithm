package baekjoon.bronze.bronzeⅠ.Boj2810_컵홀더;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String seat = br.readLine();
        int l = 0;
        for (int i = 0; i < n; i++) {
            if (seat.charAt(i) == 'L') {
                l++;
            }
        }
        l /= 2;
        System.out.println(Math.min(n + 1 - l, n));

    }
}
