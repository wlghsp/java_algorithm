package baekjoon.silverⅤ.Boj2839_설탕배달;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2839_설탕배달_다른풀이 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        int cnt =0;
        while (true) {
            if (N%5 == 0) {
                cnt += N /5;
                System.out.println(cnt);
                break;
            } else {
                N -= 3;
                cnt++;
            }

            if (N < 0) {
                System.out.println("-1");
                break;
            }
        }

    }
}
