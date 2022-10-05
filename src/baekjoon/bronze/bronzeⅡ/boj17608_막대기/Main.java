package baekjoon.bronze.bronzeⅡ.boj17608_막대기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int num = arr[arr.length-1];
        int cnt = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > num) {
                cnt++;
                num = arr[i];
            }
        }
        System.out.println(cnt);
    }
}
