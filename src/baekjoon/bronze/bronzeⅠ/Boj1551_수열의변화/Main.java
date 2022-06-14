package baekjoon.bronze.bronzeⅠ.Boj1551_수열의변화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        int[] B = new int[N - 1];

        st = new StringTokenizer(br.readLine(), ",");

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        for (int t = 0; t < K; t++) {
            for (int i = 0; i < A.length - 1; i++) {
                B[i] = A[i + 1] - A[i];
            }
            A = B;
            B = new int[A.length - 1];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < A.length -1; i++) {
            sb.append(A[i]).append(",");
        }
        sb.append(A[A.length - 1]);
        System.out.println(sb);
    }
}
