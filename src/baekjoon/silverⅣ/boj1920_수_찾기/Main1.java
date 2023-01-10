package baekjoon.silverⅣ.boj1920_수_찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1 {

    static int N, M;

    static int[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(tmp)).append("\n");
        }
        System.out.println(sb);
    }

    private static int binarySearch(int num) {
        int answer = 0;
        int l = 0, r = A.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (num == A[mid]) {
                answer = 1;
                break;
            } else if (num > A[mid]) {
                l = mid + 1;
            } else if (num < A[mid]) {
                r = mid - 1;
            }
        }
        return answer;
    }
}
