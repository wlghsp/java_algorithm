package baekjoon.bronze.bronzeⅢ.boj2547_사탕선생고창영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            br.readLine();
            int N = Integer.parseInt(br.readLine());
            BigInteger sumOfCandy = new BigInteger(String.valueOf(0));
            for (int j = 0; j < N; j++) {
                sumOfCandy = sumOfCandy.add(new BigInteger(String.valueOf(br.readLine())));
            }
            if (sumOfCandy.remainder(BigInteger.valueOf(N)).equals(BigInteger.ZERO)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
