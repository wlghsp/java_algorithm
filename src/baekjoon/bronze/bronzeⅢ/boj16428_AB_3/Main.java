package baekjoon.bronze.bronzeⅢ.boj16428_AB_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());
        BigInteger quotient = a.divide(b);
        BigInteger remainder = a.remainder(b);
        System.out.println(quotient);
        System.out.println(remainder);

    }
}
