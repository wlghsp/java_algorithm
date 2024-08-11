package baekjoon.silver.silver3.boj15652_N과M_4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver3/boj15652_N과M_4/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        backtrack(1, new int[M], 0);

        System.out.println(sb);    
    }

    private static void backtrack(int start, int[] sequence, int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(sequence[i]).append(' ');
            }
            sb.append('\n');
        } else {
            for (int i = start; i <= N; i++) {
                sequence[depth] = i;
                // start 값을 i로 설정하여 중복 허용
                backtrack(i, sequence, depth + 1);
            }
        }
    }
}
