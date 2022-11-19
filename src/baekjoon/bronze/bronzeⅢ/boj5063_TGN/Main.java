package baekjoon.bronze.bronzeⅢ.boj5063_TGN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (r+c < e) sb.append("advertise").append("\n");
            else if (r+c > e) sb.append("do not advertise").append("\n");
            else sb.append("does not matter").append("\n");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
