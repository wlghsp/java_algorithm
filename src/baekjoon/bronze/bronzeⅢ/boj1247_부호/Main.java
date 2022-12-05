package baekjoon.bronze.bronzeⅢ.boj1247_부호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            int N = Integer.parseInt(br.readLine());
            BigInteger result = new BigInteger("0");
            for (int j = 0; j < N; j++) {
                BigInteger tmp = new BigInteger(br.readLine());
                result = result.add(tmp);
            }
            if (result.equals(BigInteger.ZERO)) System.out.println("0");
            else if (result.compareTo(BigInteger.ZERO) == 1) System.out.println("+");
            else System.out.println("-");
        }
    }
}
