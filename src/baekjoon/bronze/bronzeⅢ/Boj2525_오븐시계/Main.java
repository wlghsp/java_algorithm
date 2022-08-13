package baekjoon.bronze.bronzeⅢ.Boj2525_오븐시계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int needed = Integer.parseInt(br.readLine());

        int plus = (m + needed) / 60;
        int left = (m + needed) % 60;

        h = h + plus;
        if (h >= 24) {
            h -= 24;
        }
        System.out.println(h + " " + left);
    }
}
