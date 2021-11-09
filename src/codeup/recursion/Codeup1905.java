package codeup.recursion;

/*
정수 n이 입력으로 들어오면 1부터 n까지의 합을 구하시오.
이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.
금지 키워드 : for while goto

입력
입력으로 자연수 n이 입력된다. (1<=n<=10,000)

출력
1부터 n까지의 합을 출력한다.

입력 예시   
100

출력 예시
5050

*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Codeup1905 {
    static int sum = 0;
    static void recur(int k) {
       if (k == 0) {
           return;
       }
       recur(k - 1);
       sum += k;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        recur(n);
        System.out.println(sum);
    }
}
