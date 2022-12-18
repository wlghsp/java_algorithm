package baekjoon.bronze.bronzeⅢ.boj1703_생장점;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if (a == 0) break;
            int total = 1;
            for (int i = 0; i < a; i++) {
                int splittingFactor = Integer.parseInt(st.nextToken());
                int cutted = Integer.parseInt(st.nextToken());
                total *= splittingFactor;
                total -= cutted;
            }
            System.out.println(total);
        }
    }
}
