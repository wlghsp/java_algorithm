package baekjoon.bronze.bronzeⅡ.boj2920_음계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[8];
        int[] asc = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] desc = {8, 7, 6, 5, 4, 3, 2, 1};
        for (int i = 0; i < 8; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        if (Arrays.equals(A, asc)) {
            System.out.println("ascending");
        } else if (Arrays.equals(A, desc)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

    }
}
