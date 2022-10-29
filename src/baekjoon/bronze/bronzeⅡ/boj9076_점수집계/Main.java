package baekjoon.bronze.bronzeⅡ.boj9076_점수집계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int[] a = new int[5];
            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(a);

            if (a[3] - a[1] >= 4) {
                System.out.println("KIN");
            } else {
                int sum = Arrays.stream(a).sum() - a[0] - a[4];
                System.out.println(sum);
            }
        }
    }
}
