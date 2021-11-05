package codeup.if_else;


/*
인학이는 숫자 7을 좋아한다.
어떤 정수가 입력되면 그 수가 7의 배수인지 확인하시오.

입력
자연수가 입력된다.

출력
7의 배수일 경우 multiple를 출력하고, 7의 배수가 아니면 not multiple을 출력하시오.

입력 예시   
9

출력 예시
not multiple

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1155 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        if (n % 7 == 0) {
            System.out.println("multiple");
        } else {
            System.out.println("not multiple");
        }
        
    }
}
