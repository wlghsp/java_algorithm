package baekjoon.bronze.bronzeⅡ.boj1773_폭죽쇼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] time = new int[C+1];
        for (int i = 0; i < N; i++) {
            int period = Integer.parseInt(br.readLine());
            for (int j = period; j <= C; j+= period) {
                if (time[j] == 0) {
                    time[j] = 1;
                }
            }
        }
        System.out.println(IntStream.of(time).filter(i -> i == 1).count());
    }
}
