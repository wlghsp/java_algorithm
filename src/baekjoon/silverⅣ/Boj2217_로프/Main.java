package baekjoon.silverⅣ.Boj2217_로프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] rope = new Integer[N];
        for (int i = 0; i < N; i++) {
            rope[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(rope, Collections.reverseOrder());
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int val = rope[i] * (i + 1);
            if (val > maxVal) maxVal = val;
        }
        System.out.println(maxVal);
    }
}
