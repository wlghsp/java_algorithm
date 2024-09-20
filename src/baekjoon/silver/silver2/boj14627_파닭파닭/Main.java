package baekjoon.silver.silver2.boj14627_파닭파닭;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int S, C;
    static int[] lengths;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj14627_파닭파닭/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        lengths = new int[S];
        for (int i = 0; i < S; i++) {
            lengths[i] = Integer.parseInt(br.readLine());
        }

        process();
    }

    private static void process() {
        long L = 1, R = 1_000_000_000, answer = 0;

        while (L <= R) {
            long mid = L + (R - L) / 2;
            if (determine(mid)) {
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }

        long leftover = getLeftover(R);

        System.out.println(leftover);
    }

    private static long getLeftover(long R) {
        long leftover = 0;
        int piecesCut = 0;

        for (int length : lengths) {
            piecesCut += (int) (length / R);
            leftover += (length % R);
        }

        leftover += (piecesCut - C) * R;
        return leftover;
    }

    private static boolean determine(long length) {
        int count = 0;
        for (int l : lengths) {
            count += (int) (l / length);
        }
        return count >= C;
    }
}
