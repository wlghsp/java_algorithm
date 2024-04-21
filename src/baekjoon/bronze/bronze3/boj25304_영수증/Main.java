package baekjoon.bronze.bronze3.boj25304_영수증;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int total = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            total += (Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()));
        }

        System.out.println(X == total ? "Yes" : "No");

    }
}
