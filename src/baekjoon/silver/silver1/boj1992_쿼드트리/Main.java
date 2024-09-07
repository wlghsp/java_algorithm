package baekjoon.silver.silver1.boj1992_쿼드트리;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[][] img;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver1/boj1992_쿼드트리/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        img = new int[N][N];
        for (int i = 0; i < N; i++) {
            char[] charArray = br.readLine().toCharArray();
            for (int j = 0; j < N; j++) {
                img[i][j] = charArray[j] - '0';
            }
        }
        partition(0, 0, N);

        System.out.println(sb);
    }

    private static void partition(int row, int col, int size) {
        if (isAllSame(row, col, size)) {
            sb.append(img[row][col]);
            return;
        }

        sb.append("(");
        int newSize = size / 2;

        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row + newSize, col, newSize);
        partition(row + newSize, col + newSize, newSize);

        sb.append(")");
    }

    private static boolean isAllSame(int row, int col, int size) {
        int color = img[row][col];
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (img[i][j] != color) return false;
            }
        }
        return true;
    }


}
