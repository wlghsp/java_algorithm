package baekjoon.bronze.bronzeⅢ.boj9094_수학적호기심;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for (int i = 1; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    if ((i * i + j * j + m)%(i*j) == 0) {
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }

    }
}
