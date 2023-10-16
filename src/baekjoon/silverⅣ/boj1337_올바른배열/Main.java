package baekjoon.silverⅣ.boj1337_올바른배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int maxCnt = Integer.MIN_VALUE;
        int cnt = 1;

        int priorDiff = arr[1] - arr[0];
        for (int rt = 2; rt < N; rt++) {
            int diff = arr[rt] - arr[rt -1];
            if (diff == priorDiff) {
               cnt++;
            } else {
                cnt = 1;
                priorDiff = diff;
            }
            maxCnt = Math.max(maxCnt, cnt);
        }

        System.out.println(5 - maxCnt);

    }
}
