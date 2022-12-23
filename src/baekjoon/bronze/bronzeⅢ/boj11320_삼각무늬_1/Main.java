package baekjoon.bronze.bronzeⅢ.boj11320_삼각무늬_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int a1 = a * a;
            int b1 = b * b;
            int result = a1 / b1;
            if (a % b == 1) result++;
            System.out.println(result);
        }
    }
}
