package baekjoon.bronze.bronzeⅢ.boj5354_J박스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    static StringBuilder sb = new StringBuilder();


    public static void printJbox(int n) {
        if (n == 1) {
            sb.append("#").append("\n");
        } else {
            sb.append("#".repeat(n)).append("\n");
            for (int j = 0; j < n - 2; j++) {
                sb.append("#");
                sb.append("J".repeat(n-2));
                sb.append("#\n");
            }
            sb.append("#".repeat(n)).append("\n");
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            printJbox(n);
            if (i < T -1) {
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
