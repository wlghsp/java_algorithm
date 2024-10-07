package baekjoon.gold.gold5.boj1074_Z;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, r, c, count = 0;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/gold/gold5/boj1074_Z/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        findZ(N, 0, 0);
    }

    public static void findZ(int n, int x, int y) {
        if (n == 0) {
            System.out.println(count);
            return;
        }

        int half = (int) Math.pow(2, n - 1);

        // 좌상단 사분면
        if (r < x + half && c < y + half) {
            findZ(n - 1, x, y);
        }
        // 우상단 사분면
        else if (r < x + half && c >= y + half) {
            count += half * half;
            findZ(n - 1, x, y + half);
        }
        // 좌하단 사분면
        else if (r >= x + half && c < y + half) {
            count += 2 * half * half;
            findZ(n - 1, x + half, y);
        }
        // 우하단 사분면
        else {
            count += 3 * half * half;
            findZ(n - 1, x + half, y + half);
        }
    }
}
