package baekjoon.bronze.bronzeⅡ.boj1837_암호제작;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String result = "GOOD";

        String pStr = st.nextToken();
        String kStr = st.nextToken();

        BigInteger pNum = new BigInteger(pStr);
        int kNum = Integer.parseInt(kStr);

        for (int i = 2; i < kNum; i++) {
            if (isPrime(i) && (pNum.remainder(BigInteger.valueOf(i)).compareTo(BigInteger.valueOf(0))) == 0) {
                result = "BAD " + i;
                break;
            }
        }
        System.out.println(result);


    }

    public static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i*i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
