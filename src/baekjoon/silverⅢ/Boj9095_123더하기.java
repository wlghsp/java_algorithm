package baekjoon.silverⅢ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj9095_123더하기 {
    static int[] d;

    public static void main(String[] args) throws IOException {
        // D[i] = D[i-1] + D[i-2] + D[i-3]
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        d = new int[20];
        // 점화식을 위해 초기값은 3개가 필요함
        d[1] = 1;
        d[2] = 2;
        d[3] = 4;

        for (int i = 4; i < 11; i++) { // 미리 경우의 수 구해 놓기
            d[i] = d[i-1]+ d[i-2] + d[i-3];
        }
        int t = Integer.parseInt(br.readLine());

        while (t>0) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(d[n]);
            t--;
        }
    }
}
