package baekjoon.bronze.bronzeⅢ.Boj1085_직사각형에서탈출;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int[] arr = new int[4];
        arr[0] = w - x;
        arr[1] = h - y;
        arr[2] = x;
        arr[3] = y;
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            if (answer > arr[i]) {
                answer = arr[i];
            }
        }
        System.out.println(answer);

    }
}
