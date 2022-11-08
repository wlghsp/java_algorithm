package baekjoon.bronze.bronzeⅢ.boj10569_다면체;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken()); // 꼭지점의 수
            int e = Integer.parseInt(st.nextToken());  // 모서리의 수
            // 면의 수 = 2 - v + e
            System.out.println(2 - v + e);
        }

    }
}
