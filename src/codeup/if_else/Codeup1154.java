package codeup.if_else;


/*
정수 두개가 입력으로 들어오면 큰수 - 작은수의 값을 출력하시오.

입력
두 정수가 입력된다.

출력
큰수 - 작은 수의 값이 출력된다.

입력 예시   
5 7

출력 예시
2

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Codeup1154 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a >= b) {
            System.out.println(a - b);
        } else if (a < b) {
            System.out.println(b - a);
        } 
        
    }
}
