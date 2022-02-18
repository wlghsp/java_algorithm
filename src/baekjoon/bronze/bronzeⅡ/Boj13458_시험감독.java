package baekjoon.bronze.bronzeⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj13458_시험감독 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 시험장의 갯수
        int n = Integer.parseInt(br.readLine());

        // i번 시험장의 응시자의 수
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        // 총감독관이 감시 가능 응시자의 수
        int b = Integer.parseInt(st.nextToken());
        // 부감독관이 감시 가능 응시자의 수
        int c = Integer.parseInt(st.nextToken());

        long cnt = 0;

        for (int i = 0; i < a.length; i++) {
            long result = 0;
            if (a[i] <= b) {
                cnt++;
                continue;
            } else {
                cnt++;
                a[i] -= b;
                if(a[i] % c != 0) {
                    cnt += a[i] / c + 1;
                } else {
                    cnt += a[i] / c;
                }
            }
        }

        System.out.println(cnt);
    }
}
