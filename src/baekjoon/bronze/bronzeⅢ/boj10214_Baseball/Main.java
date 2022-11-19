package baekjoon.bronze.bronzeⅢ.boj10214_Baseball;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int ySum = 0;
            int kSum = 0;
            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine());
                int y = Integer.parseInt(st.nextToken());
                int k = Integer.parseInt(st.nextToken());
                ySum += y;
                kSum = k;
            }
            if (ySum > kSum) sb.append("Yonsei").append("\n");
            else if(ySum < kSum) sb.append("Korea").append("\n");
            else sb.append("Draw");
        }
        System.out.println(sb);
    }
}
