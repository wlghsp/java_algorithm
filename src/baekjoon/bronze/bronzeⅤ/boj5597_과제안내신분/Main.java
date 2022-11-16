package baekjoon.bronze.bronzeⅤ.boj5597_과제안내신분;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[31];
        for (int i = 0; i < 28; i++) {
            a[Integer.parseInt(br.readLine())] = 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 30; i++) {
            if (a[i] != 1) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
