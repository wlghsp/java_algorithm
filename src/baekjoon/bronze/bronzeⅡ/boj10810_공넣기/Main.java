package baekjoon.bronze.bronzeⅡ.boj10810_공넣기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 바구니의 갯수, 1번부터 N번까지 번호가 매겨짐
        int M = Integer.parseInt(st.nextToken()); // M번 공을 넣음
        int[] baskets = new int[N+1];

        for (int t = 0; t < M; t++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            for (int l = i; l <= j; l++) {
                baskets[l] = k;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < baskets.length; i++) {
            sb.append(baskets[i]).append(" ");
        }
        System.out.println(sb);

    }
}
