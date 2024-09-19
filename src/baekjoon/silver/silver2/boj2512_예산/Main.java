package baekjoon.silver.silver2.boj2512_예산;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M, total, max;
    static int[] budgetRequests;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj2512_예산/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        budgetRequests = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        total = 0;
        max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            budgetRequests[i] = Integer.parseInt(st.nextToken());
            total += budgetRequests[i];
            max = Math.max(max, budgetRequests[i]);
        }
        M = Integer.parseInt(br.readLine());

        process();
    }

    private static void process() {
        if (requestsLessThanWholeBudget()) {
            System.out.println(max);
            return;
        }

        long L = 0, R = max, answer = 0;
        while (L <= R) {
            long mid = L + (R - L) / 2;
            if (determine(mid)) {
                answer = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }

        System.out.println(answer);
    }

    private static boolean requestsLessThanWholeBudget() {
        return total <= M;
    }

    private static boolean determine(long limit) {
        long sum = 0;
        for (int request : budgetRequests) {
            sum += request > limit ? limit : request;
        }
        return sum <= M;
    }
}
