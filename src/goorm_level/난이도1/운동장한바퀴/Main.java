package goorm_level.난이도1.운동장한바퀴;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double d1 = Double.parseDouble(br.readLine());
        double d2 = Double.parseDouble(br.readLine());

        double pie = 3.141592;
        // 원의 둘레 구하는 공식: 2 * pie * 원의 반지름
        double result = d1 * 2 + 2 * d2 * pie;
        System.out.printf("%.6f\n", result);

    }
}
