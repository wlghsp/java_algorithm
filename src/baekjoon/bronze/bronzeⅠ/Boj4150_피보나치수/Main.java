package baekjoon.bronze.bronzeⅠ.Boj4150_피보나치수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    static BigInteger[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        arr = new BigInteger[n + 1];

        arr[0] = BigInteger.ZERO;
        arr[1] = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 2].add(arr[i - 1]);
        }

        System.out.println(arr[n]);
    }
}
