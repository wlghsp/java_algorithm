package codeup.recursion;

/*
정수 n부터 1까지 출력하는 재귀함수를 설계하시오.
이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.
금지 키워드 : for while goto

입력
정수 n이 입력된다(1<=n<=200)

출력
n부터 1까지 한 줄에 하나씩 출력한다.

입력 예시   
10

출력 예시
10
9
8
7
6
5
4
3
2
1

*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Codeup1902 {

    static void recur(int k) {
       if (k == 0) {
           return;
       }
       System.out.println(k);
       recur(k - 1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        recur(n);
    }
}
