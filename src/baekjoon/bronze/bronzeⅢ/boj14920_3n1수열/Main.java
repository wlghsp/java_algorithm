package baekjoon.bronze.bronzeⅢ.boj14920_3n1수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c1 = Integer.parseInt(br.readLine());
        int n = 1;
        while (c1 != 1) {
            if (c1 % 2 == 0) {
               c1 = c1 / 2;
            } else {
                c1 = 3 * c1 + 1;
            }
            n++;
        }
        System.out.println(n);
    }
}
