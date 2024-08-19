package baekjoon.silver.silver3.boj1003_피보나치함수;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] zero = new int[41];
    static int[] one = new int[41];

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver3/boj1003_피보나치함수/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        zero[0] = 1;
        zero[1] = 0;
        one[0] = 0;
        one[1] = 1;
        for (int i = 2; i < 41; i++) {
            zero[i] = zero[i - 1] + zero[i - 2];
            one[i] = one[i - 1] + one[i - 2];
        }

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(zero[n] + " " + one[n]);
        }
    }

}
