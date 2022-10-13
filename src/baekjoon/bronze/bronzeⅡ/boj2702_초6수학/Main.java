package baekjoon.bronze.bronzeⅡ.boj2702_초6수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int gcd = getGCD(b > a ? b : a, b > a ? a : b);
            System.out.println((a*b)/ gcd + " " + gcd);
        }

    }

    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0){
            return num2;
        }
        return getGCD(num2, num1 % num2);
    }
}
