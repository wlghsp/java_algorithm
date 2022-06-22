package baekjoon.bronze.bronzeⅠ.Boj11005_진법변환2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 60466175
        int B = Integer.parseInt(st.nextToken()); // 36

        StringBuilder sb = new StringBuilder();
        int num = 0;
        while (N != 0) {
            num = (N % B);
            if (0 <= num && num <= 9) {
                sb.append((char) (num + 48));
            } else {
                sb.append((char) (num + 55));
            }
            N /= B;
        }

        System.out.println(sb.reverse());


    }
}
