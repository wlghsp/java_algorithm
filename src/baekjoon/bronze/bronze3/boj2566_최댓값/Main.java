package baekjoon.bronze.bronze3.boj2566_최댓값;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];
        for (int i = 0; i < 9; i++) {
            String string = br.readLine();
            String[] rows = string.split(" ");
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(rows[j]);
            }
        }
        int maxRow = 0;
        int maxCol = 0;
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (maxVal < arr[i][j]) {
                    maxVal = arr[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println(maxVal);
        System.out.println((maxRow + 1) + " " + (maxCol + 1));
    }
}
