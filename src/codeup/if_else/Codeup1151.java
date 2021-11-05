package codeup.if_else;


/*
10보다 작은 수가 입력되면 small 을 출력, 10이상이면 아무것도 출력하지 마시오.

입력
자연수가 입력된다.

출력
10미만이면 small을 출력한다.

입력 예시   
5

출력 예시
small


*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1151 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n < 10) {
            System.out.println("small");
        } 

    }
}
