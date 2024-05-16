package baekjoon.bronze.bronze2.boj10811_바구니뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] baskets;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            reverse(baskets, a - 1, b);
        }
        StringBuilder sb = new StringBuilder();
        Arrays.stream(baskets)
                .forEach(x -> {
                            sb.append(x);
                            if (x != baskets[baskets.length - 1]) {
                                sb.append(' ');
                            }
                        }
                );
        System.out.println(sb);
    }

    static void reverse(int[] arr, int start, int end) {
        int[] copy = Arrays.copyOfRange(arr, start, end);

        int len = copy.length;
        for (int i = 0; i < len; i++) {
            arr[start + i] = copy[len - (i + 1)];
        }
    }
}
