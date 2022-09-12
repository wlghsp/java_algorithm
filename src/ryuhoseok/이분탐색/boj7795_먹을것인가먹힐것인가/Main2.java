package ryuhoseok.이분탐색.boj7795_먹을것인가먹힐것인가;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {

    static int[] A, B;
    static int N, M;


    static int lower_bound(int[] A, int L, int R, int X) {
        int res = L-1;
        while (L <= R) {
            int mid = (L + R) / 2;
            if (A[mid] < X) {
                res = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        return res; // 없다면 L이 1이므로 0이 출력됨
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            A = new int[N + 1];
            B = new int[M + 1];
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                A[j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= M; j++) {
                B[j] = Integer.parseInt(st.nextToken());
            }
            // B 배열에 대해 이분 탐색을 할 예정이니까, 정렬을 해주자!
            Arrays.sort(B, 1, M + 1);
            int ans = 0;
            for (int j = 1; j <= N; j++) {
                ans += lower_bound(B, 1, M, A[j]);
            }

            System.out.println(ans);
        }

    }
}
