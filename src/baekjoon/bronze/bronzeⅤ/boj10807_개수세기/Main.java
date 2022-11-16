package baekjoon.bronze.bronzeⅤ.boj10807_개수세기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[201];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            a[Integer.parseInt(st.nextToken()) + 100]++;
        }
        System.out.println(a[Integer.parseInt(br.readLine())+100]);
    }
}
