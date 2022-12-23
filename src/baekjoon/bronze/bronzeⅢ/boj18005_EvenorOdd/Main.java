package baekjoon.bronze.bronzeⅢ.boj18005_EvenorOdd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result1 = (n * (n+1)) / 2;
        int result2 = result1 - 1 + (n + 1);
        if (result2 % 2 == 0 && result1 % 2 == 0) {
            System.out.println(2);
        } else if (result2 % 2 != 0 && result1 % 2 != 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
