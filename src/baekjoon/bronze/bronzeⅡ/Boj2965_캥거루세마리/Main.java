package baekjoon.bronze.bronzeⅡ.Boj2965_캥거루세마리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int a_dist = b - a - 1;
        int b_dist = c - b - 1;
        System.out.println(a_dist > b_dist ? a_dist : b_dist);
    }
}
