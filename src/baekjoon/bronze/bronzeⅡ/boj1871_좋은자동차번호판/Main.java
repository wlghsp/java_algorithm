package baekjoon.bronze.bronzeⅡ.boj1871_좋은자동차번호판;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String[] plate = br.readLine().split("-");
            String a = plate[0];
            int sum_a = 0;
            for (int j = 0; j < a.length(); j++) sum_a += (a.charAt(j) - 65) * Math.pow(26, 2 - j);
            int b = Integer.parseInt(plate[1]);
            if (Math.abs(sum_a - b) <= 100) {
                System.out.println("nice");
            } else {
                System.out.println("not nice");
            }
        }
    }
}
