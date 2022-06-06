package baekjoon.silverⅤ.Boj2822_점수계산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[8][2];
        int[] result = new int[5];
        int total = 0;

        for (int i = 0; i < 8; i++) {
            arr[i][0] = Integer.parseInt(br.readLine());
            arr[i][1] = i+1;
        }
        Arrays.sort(arr, Comparator.comparingInt(o -> -o[0]));

        for (int i = 0; i < 5; i++) {
            total += arr[i][0];
            result[i] = arr[i][1];
        }
        Arrays.sort(result);

        StringBuilder sb = new StringBuilder();
        for (int i : result) {
            sb.append(i).append(' ');
        }
        System.out.println(total);
        System.out.println(sb);
    }
}
