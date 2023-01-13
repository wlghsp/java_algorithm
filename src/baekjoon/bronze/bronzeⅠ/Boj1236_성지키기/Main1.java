package baekjoon.bronze.bronzeⅠ.Boj1236_성지키기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1 {

    static String[] castle;
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        castle = new String[N];

        for (int i = 0; i < N; i++) {
            castle[i] = br.readLine();
        }
        int row = 0;
        for (int i = 0; i < N; i++) {
            if (!castle[i].contains("X")) row++;
        }
        int col = 0;
        for (int i = 0; i < M; i++) {
            boolean flag = true;
            for (int j = 0; j < N; j++) {
                if (castle[j].charAt(i) == 'X') { // 경비원 있음
                    flag = false;
                    break;
                }
            }

            if (flag) col++;
        }
        System.out.println(Math.max(row, col));
    }
}
