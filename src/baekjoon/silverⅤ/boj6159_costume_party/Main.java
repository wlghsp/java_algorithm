package baekjoon.silverⅤ.boj6159_costume_party;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[] cows = new int[N];
        for (int i = 0; i < N; i++) {
            cows[i] = Integer.parseInt(br.readLine());
        }
        int left = 0;
        int right = N - 1;
        int cnt = 0;
        Arrays.sort(cows);
        while (left < right) {
            if (cows[left] + cows[right] > S) {
                right--;
            } else {
                cnt += right - left;
                left++;
            }
        }
        System.out.println(cnt);
    }
}
