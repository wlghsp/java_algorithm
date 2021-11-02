package codeup;

import java.io.IOException;
import java.util.Scanner;

/*
입력된 세 정수 a, b, c 중 가장 작은 값을 출력하는 프로그램을 작성해보자.
단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.

3 -1 5

-1


*/

public class Codeup1064 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println( a > b ? (b > c ? c: b): (a > c ? c : a));
    }
}
