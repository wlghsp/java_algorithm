package baekjoon.silverⅣ.boj1337_올바른배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        int minCnt = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = arr[i]; j < arr[i] + 5; j++) {
                if (!set.contains(j)) {
                    cnt++;
                }
            }
            minCnt = Math.min(minCnt, cnt);
        }

        System.out.println(minCnt);
    }
}
