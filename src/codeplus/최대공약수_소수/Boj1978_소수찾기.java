package codeplus.최대공약수_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1978_소수찾기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            if (isPrime(Integer.parseInt(st.nextToken()))) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }

    static boolean isPrime(int x) {

        if (x <2) return false;


        for (int i = 2; i*i <= x; i++) {
            if (x % i == 0) {
                    return false;
            }
        }

        return true;
    }

}
