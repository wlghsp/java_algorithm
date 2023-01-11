package baekjoon.silverⅤ.Boj11650_좌표정렬하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] A = new int[N][2];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            A[i][0] = x;
            A[i][1] = y;
        }
        Arrays.sort(A, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        });

        StringBuilder sb = new StringBuilder();
        for (int[] i : A) {
            sb.append(i[0]).append(" ").append(i[1]).append("\n");
        }
        System.out.println(sb);
    }
}
