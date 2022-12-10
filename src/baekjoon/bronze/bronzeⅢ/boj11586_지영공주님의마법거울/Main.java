package baekjoon.bronze.bronzeⅢ.boj11586_지영공주님의마법거울;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
        int K = Integer.parseInt(br.readLine());
        if (K == 1) {
            print1(arr);
        } else if (K == 2) {
            print2(arr);
        } else if (K == 3) {
            print3(arr);
        }
        System.out.println(sb);
    }

    private static void print3(String[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]).append("\n");
        }
    }

    private static void print2(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            sb.append(new StringBuilder(arr[i]).reverse()).append("\n");
        }
    }

    private static void print1(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append("\n");
        }
    }
}
