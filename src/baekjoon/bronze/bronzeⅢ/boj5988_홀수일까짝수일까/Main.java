package baekjoon.bronze.bronzeⅢ.boj5988_홀수일까짝수일까;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String num = br.readLine();
            if ((num.charAt(num.length() - 1) - 48) % 2 == 0) {
                sb.append("even");
            } else {
                sb.append("odd");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
