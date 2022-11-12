package baekjoon.bronze.bronzeⅠ.boj10989_수정렬하기3;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[10001];
        for (int i = 0; i < N; i++) {
            a[Integer.parseInt(br.readLine())]++;
        }
        br.close();
        for (int i = 1; i <= 10000 ; i++) {
            if (a[i] > 0) {
                bw.append((i + "\n").repeat(a[i]));
            }
        }
        bw.flush();
        bw.close();

    }
}
