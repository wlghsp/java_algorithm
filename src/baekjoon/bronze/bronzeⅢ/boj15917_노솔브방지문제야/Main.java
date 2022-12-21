package baekjoon.bronze.bronzeⅢ.boj15917_노솔브방지문제야;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Q = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            int a = Integer.parseInt(br.readLine());
            // 2가지 방법 다 가능
            if ((a & (a - 1)) == 0) sb.append(1).append("\n");
//            if ((a & (-a)) == a) sb.append(1).append("\n");
            else sb.append(0).append("\n");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
