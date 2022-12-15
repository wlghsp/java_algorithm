package baekjoon.bronze.bronzeⅢ.boj17623_Sort마스터배지훈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int lastVal = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int t = Integer.parseInt(st.nextToken());
            if (t > lastVal) lastVal = t;
        }
        System.out.println(lastVal);
    }
}
