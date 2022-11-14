package baekjoon.bronze.bronzeⅢ.boj1267_핸드폰요금;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = 0;
        int m = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            y += youngsik(num);
            m += minsik(num);
        }
        if (y < m) System.out.println("Y " + y);
        else if (y == m) System.out.println("Y M " + m);
        else System.out.println("M " + m);

    }

    public static int youngsik(int n) {
        return n / 30 * 10 + 10;
    }
    public static int minsik(int n) {
        return n / 60 * 15 + 15;
    }
}
