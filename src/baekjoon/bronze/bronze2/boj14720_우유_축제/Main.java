package baekjoon.bronze.bronze2.boj14720_우유_축제;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/bronze/bronze2/boj14720_우유_축제/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int answer = 0;
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] iceShop = {0, 1, 2};
        int idx = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            if (arr[i] == iceShop[idx]) {
                answer++;
                idx = (idx + 1) % 3;
            }
        }

        System.out.println(answer);
    }
}
