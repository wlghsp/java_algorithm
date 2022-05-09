package baekjoon.silverⅤ.Boj11653_소인수분해;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_다른풀이 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        int d = 2;

        while (N != 1) {
            if (N % d != 0) {
                d += 1;
            } else {
                N /= d;
                sb.append(d).append('\n');
            }
        }
        System.out.println(sb);
    }
}
