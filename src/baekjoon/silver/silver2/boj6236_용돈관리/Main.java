package baekjoon.silver.silver2.boj6236_용돈관리;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static long max, total;
    static int[] amounts;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj6236_용돈관리/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        amounts = new int[N];
        for (int i = 0; i < N; i++) {
            amounts[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, amounts[i]);
            total += amounts[i];
        }
        process();
    }

    private static void process() {
        long L = max;
        long R = total;
        long answer = 0;

        while (L <= R) {
            long mid = L + (R - L) / 2;
            if (determine(mid)) {
                answer = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }

        System.out.println(answer);
    }

    private static boolean determine(long k) {
        int count = 1;
        long balance = k;
        for (int amount : amounts) {
            if (amount > balance) {
                balance = k;
                count++;
            }
            balance -= amount;
        }

        return count <= M;
    }
}
