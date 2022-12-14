package baekjoon.bronze.bronzeⅢ.boj15781_헬멧과조끼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int maxHelmet = Integer.MIN_VALUE;
        int maxVest = Integer.MIN_VALUE;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int helmet = Integer.parseInt(st.nextToken());
            if (helmet > maxHelmet) {
                maxHelmet = helmet;
            }
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int vest = Integer.parseInt(st.nextToken());
            if (vest > maxVest) {
                maxVest = vest;
            }
        }
        System.out.println(maxHelmet + maxVest);
    }
}
