package baekjoon.bronze.bronze3.boj10810_공_넣기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        for (int t = 0; t < M; t++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            for (int l = i - 1; l <= j - 1; l++) {
                arr[l] = k;
            }
        }
        StringBuilder sb = new StringBuilder();
        Arrays.stream(arr)
                .forEach(x -> sb.append(x).append(" "));
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
