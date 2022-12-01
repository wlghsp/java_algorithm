package baekjoon.bronze.bronzeⅣ.boj25591_푸앙이와종윤이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int a = 100 - x;
        int b = 100 - y;
        int c = 100 - (a + b);
        int d = a * b;
        int q = 0;
        int r;
        int frontNum;
        int backNum;
        if (d >= 100) {
            q = d / 100;
            r = d % 100;
            frontNum = c + q;
            backNum = r;
        } else {
            frontNum = c;
            backNum = d;
            r = d;
        }
        System.out.printf("%d %d %d %d %d %d\n", a, b, c, d, q, r);
        System.out.printf("%d %d", frontNum, backNum);
    }
}
