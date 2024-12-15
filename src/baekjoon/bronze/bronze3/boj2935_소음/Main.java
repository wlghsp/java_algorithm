package baekjoon.bronze.bronze3.boj2935_소음;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String operator = br.readLine();
        String b = br.readLine();
        System.out.println(calculate(a, operator, b));
    }

    private static String calculate(String a, String operator, String b) {
        if (operator.equals("+")) {
            return new BigInteger(a).add(new BigInteger(b)).toString();
        }
        return new BigInteger(a).multiply(new BigInteger(b)).toString();
    }
}
