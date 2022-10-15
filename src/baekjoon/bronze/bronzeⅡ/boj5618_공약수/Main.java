package baekjoon.bronze.bronzeⅡ.boj5618_공약수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= arr[0]; i++) {
            int cnt = 0;
            for (int j : arr) {
                if (j % i == 0) {
                    cnt++;
                }
            }
            if (cnt == arr.length) sb.append(i).append('\n');
        }

        System.out.println(sb);
    }
}
