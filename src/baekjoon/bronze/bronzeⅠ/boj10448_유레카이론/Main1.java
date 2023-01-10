package baekjoon.bronze.bronzeⅠ.boj10448_유레카이론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {
    static int[] T;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 자연수가 최대 1000이므로  n은 최대 44(990)가 된다.
        // 45이면 1000을 넘으므로 삼각수를 만들 수 없다.
        T = new int[45];
        T[1] = 1;
        T[2] = 3;
        for (int i = 3; i < 45; i++) {
            T[i] = T[i - 1] + i;
        }
        while (N-- > 0) {
            int k = Integer.parseInt(br.readLine());
            System.out.println(isTriangularNum(k));
        }
    }

    private static int isTriangularNum(int n) {
        for (int i = 1; i < 45; i++) {
            for (int j = 1; j < 45; j++) {
                for (int k = 1; k < 45; k++) {
                    if (n == (T[i] + T[j] + T[k])) return 1;
                }
            }
        }
        return 0;
    }
}
