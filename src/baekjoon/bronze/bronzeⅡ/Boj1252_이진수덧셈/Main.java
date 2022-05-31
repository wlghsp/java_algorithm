package baekjoon.bronze.bronzeⅡ.Boj1252_이진수덧셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 2의 80제곱을 넘어서면 long 타입의 2의 63제곱도 넘어선다

        // 2를 집어 넣어주면 이진수를 10진수 BigInteger로 바꿘준다
        BigInteger a = new BigInteger(st.nextToken(), 2);
        BigInteger b = new BigInteger(st.nextToken(), 2);

        // BigInteger 덧셈
        BigInteger sum = a.add(b);

        // 2진수 변환
        System.out.println(sum.toString(2));
    }
}
