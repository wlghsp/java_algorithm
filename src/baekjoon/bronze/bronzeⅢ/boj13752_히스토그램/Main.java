package baekjoon.bronze.bronzeⅢ.boj13752_히스토그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int k = Integer.parseInt(br.readLine());
            sb.append("=".repeat(k)).append("\n");
        }
        System.out.println(sb);
    }
}
