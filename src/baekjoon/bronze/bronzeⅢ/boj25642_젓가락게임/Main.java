package baekjoon.bronze.bronzeⅢ.boj25642_젓가락게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int i = 0;
        while (a < 5 && b < 5) {
            if (i % 2 == 0) {
                b += a;
            } else {
                a += b;
            }
            i++;
        }

        if (a >= 5) {
            System.out.println("yj");
        } else {
            System.out.println("yt");
        }

    }
}
