package codeup;

import java.io.IOException;
import java.util.Scanner;

/*
두 정수(a, b)를 입력받아
a와 b가 같으면 1을, 같지 않으면 0을 출력하는 프로그램을 작성해보자.

0 0
1

*/

public class Codeup1050 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println( a == b ? 1 : 0);
    }
}
