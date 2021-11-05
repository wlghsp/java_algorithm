package codeup.if_else;


/*
두 정수가 입력된다.  두 정수의 크기를 비교하여 왼쪽 수가 크면 > 를 출력, 오른쪽 수가 크면 < 를 출력, 같으면 = 을 출력하시오.

입력
두 정수 a, b가 입력된다.

출력
a가 b보다 크면  > 를 출력,
b가 a보다 크면  < 를 출력,
a와 b가 같으면  = 를 출력한다.

입력 예시   
2 6

출력 예시
<

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Codeup1153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("=");
        }
        
    }
}
