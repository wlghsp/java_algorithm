package codeup.recursion;

/*
피보나치 수열이란 앞의 두 수를 더하여 나오는 수열이다.
첫 번째 수와 두 번째 수는 모두 1이고, 세 번째 수부터는 이전의 두 수를 더하여 나타낸다. 피보나치 수열을 나열해 보면 다음과 같다.
1, 1, 2, 3, 5, 8, 13 …

자연수 N을 입력받아 N번째 피보나치 수를 출력하는 프로그램을 작성하시오.
단, N이 커질 수 있으므로 출력값에 10,009를 나눈 나머지를 출력한다.

※ 이 문제는 반드시 재귀함수를 이용하여 작성 해야한다.
금지 키워드 : for while goto

입력
자연수 N이 입력된다. (N은 200보다 같거나 작다.)

출력
N번째 피보나치 수를 출력하되, 10,009를 나눈 나머지 값을 출력한다.

입력 예시   
7

출력 예시
13

*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Codeup1916 {

    static long[] arr = new long[201];

    static long fibo(int k) {
       if (k == 1 || k == 2) {            
            arr[k] = 1;
            return 1;
       } else if (arr[k] != 0) { // 한 번 이상 구한 것은 바로 저장된 값 리턴!!
           return arr[k];
       } else {
           return arr[k] = (fibo(k-1) + fibo(k-2)) % 10009;
       }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long result = fibo(n);
        System.out.println(result);
    }
}
