package baekjoon.bronze.bronzeⅢ.Boj1085_직사각형에서탈출;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int[] arr = new int[4];
        arr[0] = x;
        arr[1] = y;
        arr[2] = w - x;
        arr[3] = h - y;
        System.out.println(Arrays.stream(arr).min().getAsInt());
    }
}
