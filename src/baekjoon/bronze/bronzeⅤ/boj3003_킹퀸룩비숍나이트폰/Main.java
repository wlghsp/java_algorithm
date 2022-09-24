package baekjoon.bronze.bronzeⅤ.boj3003_킹퀸룩비숍나이트폰;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] chess = {1, 1, 2, 2, 2, 8};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int horse = Integer.parseInt(st.nextToken());
            sb.append(chess[i] - horse).append(" ");
        }
        System.out.println(sb);
    }
}
