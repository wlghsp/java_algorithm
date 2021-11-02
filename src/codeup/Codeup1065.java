package codeup;

import java.io.IOException;
import java.util.Scanner;

/*
세 정수 a, b, c가 입력되었을 때, 짝수만 출력해보자.

세 정수 a, b, c 가 공백을 두고 입력된다.
0 ~ +2147483647 범위의 정수들이 입력되며 적어도 1개는 짝수이다

짝수만 순서대로 줄을 바꿔 출력한다.


1 2 4

2
4


*/

public class Codeup1065 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println(a);
        }
        if (b % 2 == 0) {
            System.out.println(b);
        }
        if (c % 2 == 0) {
            System.out.println(c);
        }
        
    }
}
