package codeup.basic100;

import java.io.IOException;
import java.util.Scanner;

/*
두 정수(a, b)를 입력받아

a가 b보다 크면 1을, a가 b보다 작거나 같으면 0을 출력하는 프로그램을 작성해보자.

9 1

1

*/

public class Codeup1049 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println( a > b ? 1 : 0);
    }
}
