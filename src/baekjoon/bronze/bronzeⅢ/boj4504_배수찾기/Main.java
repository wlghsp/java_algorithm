package baekjoon.bronze.bronzeⅢ.boj4504_배수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (true) {
            int t = Integer.parseInt(br.readLine());
            if (t == 0) break;
            boolean multiple = false;
            if (t % n == 0) multiple = true;
            sb.append(t).append(" is");
            if (!multiple) sb.append(" NOT");
            sb.append(" a multiple of ").append(n).append(".\n");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
