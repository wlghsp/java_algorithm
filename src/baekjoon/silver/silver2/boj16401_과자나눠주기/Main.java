package baekjoon.silver.silver2.boj16401_과자나눠주기;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M, max;
    static int[] snackLengths;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj16401_과자나눠주기/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        snackLengths = new int[M];
        max = Integer.MIN_VALUE;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            snackLengths[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, snackLengths[i]);
        }

        process();
    }

    private static void process() {
        int L = 1, R = max, answer = 0;

        while (L <= R) {
            int mid = L + (R - L) / 2;
            if (determine(mid)) {
                answer = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }

        System.out.println(answer);
    }

    private static boolean determine(int length) {
        int count = 0;

        for (int snack : snackLengths) {
            count += snack / length;
        }

        return count >= N;
    }
}
