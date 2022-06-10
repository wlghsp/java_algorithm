package baekjoon.bronze.bronzeⅠ.Boj1652_누울자리를찾아라;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] room = new String[N];
        for (int i = 0; i < N; i++) {
            room[i] = br.readLine();
        }

        int vertical = 0, horizontal = 0;

        for (int i = 0; i < N; i++) {
            int row = 0, col = 0;
            for (int j = 0; j < N; j++) {
                // 가로
                if (room[i].charAt(j) == '.') {
                    row++;
                } else {
                    row = 0;
                }
                if (row == 2) {
                    vertical++;
                }

                if (room[j].charAt(i) == '.') {
                    col++;
                } else {
                    col = 0;
                }
                if (col == 2) {
                    horizontal++;
                }
            }
        }

        System.out.printf("%d %d", vertical, horizontal);

    }
}
