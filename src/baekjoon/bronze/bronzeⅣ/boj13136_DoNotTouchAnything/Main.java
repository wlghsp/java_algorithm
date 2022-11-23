package baekjoon.bronze.bronzeⅣ.boj13136_DoNotTouchAnything;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        long result = (long) (R % N == 0 ? R / N : R / N + 1) * (C % N == 0 ? C / N : C / N + 1);
        System.out.println(result);

    }
}
