package baekjoon.bronze.bronzeⅠ.Boj2775_부녀회장이될테야;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] apart = new int[15][15];
        for (int i = 0; i < 15; i++) { //
            apart[i][1] = 1; // i층 1호 0~14층까지
            apart[0][i] = i; // 0층 i호  0호부터 14호까지
        }

        for (int i = 1; i < 15; i++) { // 1층 부터 14층까지
            for (int j = 2; j < 15; j++) { // 2호부터 14호까지
                apart[i][j] = apart[i][j-1] + apart[i-1][j];
            }
        }
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(apart[k][n]);
        }

    }
}
