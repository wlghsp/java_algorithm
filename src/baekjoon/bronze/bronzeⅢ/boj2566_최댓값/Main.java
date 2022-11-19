package baekjoon.bronze.bronzeⅢ.boj2566_최댓값;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxVal = Integer.MIN_VALUE;
        int row = 1;
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < 9; i++) {
            int[] result = getMaxValue(br.readLine(), row);
            if (maxVal < result[0]) {
                maxVal = result[0];
                maxRow = result[1];
                maxCol = result[2];
            }
            row++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(maxVal).append("\n");
        sb.append(maxRow).append(" ").append(maxCol);
        System.out.println(sb);
    }

    private static int[] getMaxValue(String s, int row) {
        int max = Integer.MIN_VALUE;
        String[] s1 = s.split(" ");
        int maxCol = 1;
        int col = 1;
        for (int i = 0; i < s1.length; i++) {
            int n = Integer.parseInt(s1[i]);
            if (max < n) {
                max = n;
                maxCol = col;
            }
            col++;
        }
        return new int[]{max, row, maxCol};
    }
}
