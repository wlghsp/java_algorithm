package baekjoon.bronze.bronzeⅠ.boj2693_N번째큰수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            arr = new int[10];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            sb.append(arr[arr.length - 3]).append("\n");
        }
        System.out.println(sb);
    }
}
