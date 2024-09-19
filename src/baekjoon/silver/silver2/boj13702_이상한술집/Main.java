package baekjoon.silver.silver2.boj13702_이상한술집;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, K;
    static int[] volumes;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj13702_이상한술집/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        volumes = new int[N];
        for (int i = 0; i < N; i++) {
            volumes[i] = Integer.parseInt(br.readLine());
        }

        process();
    }

    private static void process() {
        long L = 0, R = Integer.MAX_VALUE, answer = 0;

        while (L <= R) {
            long mid = L + (R - L) / 2;
            if (determination(mid)) {
                answer = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }

        System.out.println(answer);
    }

    private static boolean determination(long volume) {
        int count = 0;

        for (int v : volumes) {
            count += (int) (v / volume);
        }

        return count >= K;
    }

}
