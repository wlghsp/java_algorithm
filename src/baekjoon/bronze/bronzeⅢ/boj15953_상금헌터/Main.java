package baekjoon.bronze.bronzeⅢ.boj15953_상금헌터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] first = {5000000,
                3000000, 3000000,
                2000000, 2000000, 2000000,
                500000, 500000, 500000, 500000,
                300000, 300000, 300000, 300000, 300000,
                100000, 100000, 100000, 100000, 100000, 100000};
        int[] second = {5120000,
                2560000, 2560000,
                1280000, 1280000, 1280000, 1280000,
                640000, 640000, 640000, 640000, 640000, 640000, 640000, 640000,
                320000, 320000, 320000, 320000, 320000, 320000, 320000, 320000,
                320000, 320000, 320000, 320000, 320000, 320000, 320000, 320000};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int result = 0;
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            result += a <= first.length && a > 0 ? first[a-1] : 0;
            result += b <= second.length && b > 0 ? second[b-1] : 0;
            sb.append(result).append("\n");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
