package baekjoon.bronze.bronzeⅠ.Boj1236_성지키기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] castle = new String[N];

        for (int i = 0; i < N; i++) {
            castle[i] = br.readLine();
        }
        int row = 0, col = 0;

        // 가로 체크
        for (int i = 0; i < N; i++) {
            if (!castle[i].contains("X")) {
                row++;
            }
        }

        // 세로 체크
        for (int i = 0; i < M; i++) {
            boolean isProtected = false;
            for (int j = 0; j < N; j++) {
                if (castle[j].charAt(i) == 'X') {
                    isProtected = true;
                }
            }
            if (!isProtected)  {
                col++;
            }
        }
        if (row > col) {
            System.out.println(row);
        } else {
            System.out.println(col);
        }

    }
}
