package baekjoon.silver.silver2.boj2805_나무자르기;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj2805_나무자르기/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        process();
    }

    private static void process() {
        long L = 0, R = 2_000_000_000, answer = 0;

        while (L <= R) {
            long mid = L + (R - L) / 2;
            if (determination((int) mid)) {
                answer = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }

        System.out.println(answer);
    }

    private static boolean determination(int H) {
        long sum = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] > H) {
                sum += arr[i] - H;
            }
        }

        return sum >= M;
    }

}
