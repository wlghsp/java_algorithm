package baekjoon.bronze.bronzeⅢ.boj1547_공;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] cups;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        cups = new int[3];
        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < cups.length; i++) {
            cups[i] = i+1;
        }
        StringTokenizer st;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            swap(x, y);
        }
        System.out.println(cups[0]);
    }

    private static void swap(int x, int y) {
        int xIdx = -1;
        int yIdx = -1;
        for (int i = 0; i < cups.length; i++) {
            if (cups[i] == x) {
                xIdx = i;
            }
            if (cups[i] == y) {
                yIdx = i;
            }
        }
        int tmp = cups[xIdx];
        cups[xIdx] = cups[yIdx];
        cups[yIdx] = tmp;
    }
}
