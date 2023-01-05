package baekjoon.bronze.bronzeⅡ.boj5176_대회자리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        for (int i = 0; i < K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] seats = new int[m + 1];
             for (int j = 0; j < p; j++) {
                 int s = Integer.parseInt(br.readLine());
                if (seats[s] == 0) seats[s] = 1;
            }
            long count = Arrays.stream(seats).filter(x -> x == 1).count();
            System.out.println(p - count);
        }
    }
}
