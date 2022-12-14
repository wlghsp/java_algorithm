package baekjoon.bronze.bronzeⅢ.boj5612_터널의입구와출구;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int maxCars = Integer.MIN_VALUE;
        boolean zero = false;
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int in = Integer.parseInt(st.nextToken());
            int out = Integer.parseInt(st.nextToken());
            m += in;
            if (m > maxCars) {
                maxCars = m;
            }
            m -= out;
            if (m < 0) zero = true;

        }
        System.out.println(zero ? 0 : maxCars);
    }
}
