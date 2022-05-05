package baekjoon.silverⅤ.Boj2839_설탕배달;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2839_설탕배달 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        int answer = Integer.MAX_VALUE;
        for (int y = 0; y < (N/3)+1; y++) {
            for (int x = 0; x < (N/5) + 1; x++) {
                if (5*x + 3*y == N){
                    answer = Math.min(answer, x + y);
                }
            }
        }

        if (answer == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }
    }
}
