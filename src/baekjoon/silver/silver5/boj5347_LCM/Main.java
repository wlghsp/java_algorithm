package baekjoon.silver.silver5.boj5347_LCM;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver5/boj5347_LCM/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(getLCM(a, b)).append('\n');
        }

        System.out.println(sb);
    }


    private static long getLCM(int a, int b) {
        return (long) a * b / getGCD(a, b);
    }

    private static long getGCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return getGCD(b, a % b);
    }
}
