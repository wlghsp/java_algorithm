package baekjoon.bronze.bronzeⅢ.boj23804_골뱅이찍기ㄷ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append("@@@@@".repeat(N)).append("\n");
        }

        for (int i = 0; i < 3* N; i++) {
            sb.append("@".repeat(N)).append("\n");
        }

        for (int i = 0; i < N; i++) {
            sb.append("@@@@@".repeat(N)).append("\n");
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
