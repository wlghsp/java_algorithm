package baekjoon.bronze.bronzeⅢ.boj2576_홀수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < 7; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if (tmp % 2 != 0) {
                sum += tmp;
                if (tmp < minVal) minVal = tmp;
            }

        }

        if (sum == 0) System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(minVal);
        }

    }
}
