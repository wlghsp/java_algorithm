package baekjoon.bronze.bronzeⅣ.Boj10039_평균점수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        for (int i = 0; i < 5; i++) {
            int score = Integer.parseInt(br.readLine());
            if (score < 40) score = 40;
            total += score;
        }

        int result = total / 5;
        System.out.println(result);
    }
}
