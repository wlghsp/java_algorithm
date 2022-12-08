package baekjoon.bronze.bronzeⅢ.boj1598_꼬리를무는숫자나열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()) - 1;
        int b = Integer.parseInt(st.nextToken()) - 1;
        System.out.println(Math.abs(a / 4 - b / 4) + Math.abs(a % 4 - b % 4));
    }
}
