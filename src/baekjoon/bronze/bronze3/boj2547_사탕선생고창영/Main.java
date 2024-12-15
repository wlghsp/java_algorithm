package baekjoon.bronze.bronze3.boj2547_사탕선생고창영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            br.readLine();

            int N = Integer.parseInt(br.readLine());

            BigInteger total = new BigInteger("0");
            for (int i = 0; i < N; i++) {
                total = total.add(new BigInteger(br.readLine()));
            }

            System.out.println(total.mod(BigInteger.valueOf(N)).equals(BigInteger.ZERO) ? "YES" : "NO");
        }
    }
}
