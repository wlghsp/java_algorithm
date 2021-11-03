package codeup.basic100;

import java.io.IOException;
import java.util.Scanner;

/*
두 정수(a, b)를 입력받아
b가 a보다 크거나 같으면 1을, 그렇지 않으면 0을 출력하는 프로그램을 작성해보자.

0 0
1

*/

public class Codeup1051 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println( a <= b ? 1 : 0);
    }
}
