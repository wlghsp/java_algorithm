package baekjoon.bronze.bronzeⅣ.boj11549_Identifying_tea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int cnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            int answer = Integer.parseInt(st.nextToken());
            if (answer == T) cnt++;
        }
        System.out.println(cnt);
    }
}
