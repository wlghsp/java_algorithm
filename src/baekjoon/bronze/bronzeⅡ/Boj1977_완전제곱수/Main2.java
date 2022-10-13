package baekjoon.bronze.bronzeⅡ.Boj1977_완전제곱수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int minVal = Integer.MAX_VALUE;
        boolean flag = false;
        for (int i = M; i <= N; i++) {
            if (i % Math.sqrt(i) == 0) {
                flag = true;
                sum += i;
                if (minVal > i) minVal = i;
            }
        }
        if (flag) {
            System.out.println(sum);
            System.out.println(minVal);
        } else {
            System.out.println(-1);
        }
    }
}
