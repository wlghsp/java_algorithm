package baekjoon.bronze.bronzeⅢ.boj5361_전투드로이드가격;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            double c = Double.parseDouble(st.nextToken());
            double d = Double.parseDouble(st.nextToken());
            double e = Double.parseDouble(st.nextToken());
            double sum = 350.34 * a + 230.90 * b + 190.55 * c + 125.30 * d + 180.90 * e;
            System.out.printf("$%.2f\n", sum);
        }
    }
}
