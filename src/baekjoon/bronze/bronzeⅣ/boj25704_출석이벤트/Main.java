package baekjoon.bronze.bronzeⅣ.boj25704_출석이벤트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 출석 도장의 갯수
        int P = Integer.parseInt(br.readLine()); // 물건의 가격

        double result = 0;
        if (N >= 20) {
            result = Math.min(P-2000, P * 0.75);
        } else if (N >= 15) {
            result = Math.min(P -2000 , P * 0.90);
        } else if (N >= 10) {
            result = Math.min(P- 500, P * 0.90);
        } else if (N >= 5) {
            result = P - 500;
        } else {
            result = P;
        }
        System.out.printf("%.0f", result < 0 ? 0: result);
    }
}
