package codeup.if_else;


/*
10보다 작은 정수가 입력되면 small 을 출력, 그 이상의 수가 입력되면 big 을 출력하시오.

입력
정수가 입력된다.

출력
10미만 : small 
10이상 : big 
을 출력한다.

입력 예시   
15

출력 예시
big

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n < 10) {
            System.out.println("small");
        } else {
            System.out.println("big");
        }

    }
}
