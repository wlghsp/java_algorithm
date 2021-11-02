package codeup;

import java.io.IOException;
import java.util.Scanner;

/*
입력된 정수의 부호를 바꿔 출력해보자.
단, -2147483647 ~ +2147483647 범위의 정수가 입력된다.

*/

public class Codeup1040 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        System.out.print(-a);
    }
}
