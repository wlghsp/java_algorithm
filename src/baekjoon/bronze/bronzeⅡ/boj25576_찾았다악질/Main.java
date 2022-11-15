package baekjoon.bronze.bronzeⅡ.boj25576_찾았다악질;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] a = new int[M];
        for (int i = 0; i < M; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int difference = 0;
            for (int j = 0; j < M; j++) {
                int t = Integer.parseInt(st.nextToken());
                difference += Math.abs(a[j] - t);
            }
            if (difference > 2000) cnt++;
        }
//        System.out.println(cnt >= ((N-1) / 2) ? "YES" : "NO");
        System.out.println((double) cnt / ((N-1) / 2) >= 0.5 ? "YES" : "NO");
    }
}