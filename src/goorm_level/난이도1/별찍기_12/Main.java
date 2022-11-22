package goorm_level.난이도1.별찍기_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(" ".repeat(N - i - 1)).append("*".repeat(i + 1)).append("\n");
        }
        for (int i = 0; i < N - 1; i++) {
            sb.append(" ".repeat(i + 1)).append("*".repeat(N - i - 1)).append("\n");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);

    }
}
