package codeup.string;

/*
우리는 숫자를 int나 long long으로 숫자를 처리하였다.
이번엔 그보다 더 큰 숫자를 비교해보자.
최대 100자리의 두 숫자가 입력되면 작은수와 큰 수를 차례대로 출력하시오.

입력
정수 두개가 입력된다.(최대 100자리) - 같은 숫자는 입력되지 않는다.

출력
작은수 큰수 순서로 출력한다.

입력 예시   
9999999999999999999999999 9999999999999999999999998

출력 예시
9999999999999999999999998 9999999999999999999999999

*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Codeup1754 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());
        System.out.println(a.compareTo(b) == 1 ? b+ " " +a : a + " " + b);
    }
}
