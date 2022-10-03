package ryuhoseok.parametric_search.boj1654_랜선자르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int K, N;
    static int[] A;

    static boolean determination(long len) {
        // len 만큼의 길이로 랜선들을 잘랐을 때, N개 만큼의 랜선을 얻을 수 있는가?
        long sum = 0;
        for (int i = 1; i <= K; i++) {
            sum += A[i] / len;
        }
        return sum >= N;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        A = new int[K + 1];
        for (int i = 1; i <= K; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        long L = 1, R  = Integer.MAX_VALUE, ans = 0;

        while (L <= R) {
            long mid = (L + R) /2;
            if (determination(mid)){
                ans = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }

        System.out.println(ans);

    }
}
