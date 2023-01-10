package baekjoon.silverⅤ.boj10815_숫자카드;

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
        int N = Integer.parseInt(br.readLine());
        A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(A);
        StringBuilder sb = new StringBuilder();
        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(tmp)).append(" ");
        }
        System.out.println(sb);

    }

    private static int binarySearch(int target) {
        int ans = 0;
        int l = 0, r = A.length - 1;
        int mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (target == A[mid]) {
                ans = 1;
                break;
            } else if (target > A[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
