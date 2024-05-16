package baekjoon.bronze.bronze2.boj10813_공_바꾸기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    static int N, M;
    static int[] baskets;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        baskets = new int[N];
        IntStream.range(0, N)
                .forEach(n -> baskets[n] = n + 1);

        for (int p = 0; p < M; p++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;

            int temp = baskets[i];
            baskets[i] = baskets[j];
            baskets[j] = temp;
        }
        StringBuilder sb = new StringBuilder();
        Arrays.stream(baskets)
                .forEach(c -> sb.append(c).append(' '));
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
