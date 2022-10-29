package baekjoon.bronze.bronzeⅢ.Boj4153_직각삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        while (true) {
            String tmp = br.readLine();
            if (tmp.equals("0 0 0")) break;
            st = new StringTokenizer(tmp);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a * a + b * b == c * c) {
                System.out.println("right");
            } else if (c * c + b * b == a * a) {
                System.out.println("right");
            } else if (c * c + a * a == b * b) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }

    }
}
