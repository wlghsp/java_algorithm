package baekjoon.silver.silver5.boj27468_증가배열만들기;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M, K;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver5/boj27468_증가배열만들기/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        if (M + N - 1 > K) {
            System.out.println("NO");
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("YES").append("\n");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(i + j + 1).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
