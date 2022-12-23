package baekjoon.bronze.bronzeⅢ.boj17174_전체계산횟수;

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
        int cnt = N;
        int quotient = N / M;
        cnt += quotient;
        while (quotient >= M) {
            quotient /= M;
            cnt += quotient;
        }
        System.out.println(cnt);
    }
}
