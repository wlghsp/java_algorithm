package baekjoon.bronze.bronze2.boj1350_진짜공간;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] fileSizes;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        fileSizes = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            fileSizes[i] = Integer.parseInt(st.nextToken());
        }

        long clusterSize = Long.parseLong(br.readLine());
        long totalSpace = 0;

        for (int fileSize : fileSizes) {
            totalSpace += ((fileSize + clusterSize - 1) / clusterSize) * clusterSize;
        }

        System.out.println(totalSpace);
    }
}
