package baekjoon.bronze.bronzeⅠ.Boj2669_직사각형네개의합집합의면적구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] coordi = new int[100][100];
        StringTokenizer st;
        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    coordi[j][k] = 1;
                }
            }
        }
        
        
        int answer = 0;
        for (int i = 0; i < coordi.length; i++) {
            for (int j = 0; j < coordi.length; j++) {
                if (coordi[i][j] > 0) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
