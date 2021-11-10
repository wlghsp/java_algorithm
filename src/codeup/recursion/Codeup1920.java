package codeup.recursion;

/*
어떤 10진수 n이 주어지면 2진수로 변환해서 출력하시오.

예)
10    ----->  1010
0    ----->  0
1    ----->  1
2    ----->  10
1024    ----->  10000000000

이 문제는 반복문을 이용하여 풀 수 없습니다.
금지 키워드 : for while goto

입력
10진수 정수 n이 입력된다.
(0<=n<=2,100,000,000)

출력
2진수로 변환해서 출력한다.

입력 예시   
7

출력 예시
111

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Codeup1920 {

    static String convert(int n, String result) {
        if (n == 0) { // 0 일 때 종료 조건
             
            return result == "" ? "0" : result;
        }
        return convert(n / 2, String.valueOf(n % 2) + result);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String result = "";
        System.out.println(convert(n, result));
    }
}
