package baekjoon.silver.silver3.boj15649_N과M_1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver3/boj15649_N과M_1/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];
        boolean[] visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }
        
        backtrack(arr, visited, "", 0);

        System.out.println(sb);    
    }

    private static void backtrack(int[] arr, boolean[] visited, String sequence, int length) {
        if (length == M) {
            for (char c : sequence.toCharArray()) {
                sb.append(c).append(' ');
            }
            sb.append('\n');
        } else {
            for (int i = 1; i <= N; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    backtrack(arr, visited, sequence + arr[i], length + 1);
                    visited[i] = false;
                }
            }
        }
    }
}
