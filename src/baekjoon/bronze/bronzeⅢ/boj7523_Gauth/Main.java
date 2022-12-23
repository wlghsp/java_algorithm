package baekjoon.bronze.bronzeⅢ.boj7523_Gauth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());
            sb.append("Scenario #").append(i).append(":\n");
            long result = ((n + m) * ((m - n) + 1)) / 2;
            sb.append(result).append("\n");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
