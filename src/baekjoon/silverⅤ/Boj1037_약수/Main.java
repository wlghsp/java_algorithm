package baekjoon.silverⅤ.Boj1037_약수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine()); // N의 진짜 약수의 갯수

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // 최솟값과 최댓값을 구하고 이를 곱하면 N을 구할 수 있다.
        for (int i = 0; i < k; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println(max * min);

    }
}
