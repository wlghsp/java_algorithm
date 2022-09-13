package ryuhoseok.이분탐색.boj2470_두용액;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {
    static int N;
    static int[] A;

    static int lower_bound(int[] A, int L, int R, int X) {

        int res = R + 1;
        while (L <= R) {
            int mid = (L + R) / 2;
            if (A[mid] >= X) {
                res = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }

        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        A = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A, 1, N + 1);

        int best_sum = Integer.MAX_VALUE;
        int v1 = 0, v2 = 0;
        for (int left = 1; left <= N -1; left++) {
            int res = lower_bound(A, left + 1, N, -A[left]);


            if (left + 1 <= res -1 && res -1 <= N && Math.abs(A[res-1] + A[left]) < best_sum) {
                best_sum = Math.abs(A[res-1] + A[left]);
                v1 = A[left];
                v2 = A[res - 1];
            }
            if (left + 1 <= res && res <= N && Math.abs(A[res] + A[left]) < best_sum) {
                best_sum = Math.abs(A[res] + A[left]);
                v1 = A[left];
                v2 = A[res];
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(v1).append(' ').append(v2);
        System.out.println(sb);

    }
}
