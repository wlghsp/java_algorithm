package baekjoon.bronze.bronzeⅠ.Boj14467_소가길을건너간이유1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] cows = new int[N + 1];
        Arrays.fill(cows, -1);
        int ans = 0;
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int cowNum = Integer.parseInt(st.nextToken());
            int loc = Integer.parseInt(st.nextToken());
            if (cows[cowNum] == -1) {
                cows[cowNum] = loc;
            } else if (cows[cowNum] != loc) {
                cows[cowNum] = loc;
                ans++;
            }
        }

        System.out.println(ans);


    }
}
