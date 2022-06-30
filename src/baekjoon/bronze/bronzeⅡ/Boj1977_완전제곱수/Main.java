package baekjoon.bronze.bronzeⅡ.Boj1977_완전제곱수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean isPerfect(int num) {
        // 제곱근으로 만들고, 정수로 만들어서 다시 제곱했을 때 원래 숫자와 같은지 확인
        return Math.pow(Math.floor(Math.sqrt(num)), 2) == num;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int minVal = Integer.MAX_VALUE;
        boolean found = false;
        for (int i = M; i <= N; i++) {
            if (isPerfect(i)) {
                found = true;
                sum += i;
                if (minVal > i) minVal = i;
            }
        }

        if (found) {
            System.out.println(sum);
            System.out.println(minVal);
        } else {
            System.out.println(-1);
        }

    }
}
