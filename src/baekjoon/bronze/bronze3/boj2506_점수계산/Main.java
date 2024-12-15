package baekjoon.bronze.bronze3.boj2506_점수계산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] arr, scores;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[N];
        scores = new int[N];
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int result = Integer.parseInt(st.nextToken());
            cnt = result == 1 ? cnt + 1 : 0;
            scores[i] = cnt;
        }
        int sum = Arrays.stream(scores)
                .sum();
        System.out.println(sum);
    }
}
