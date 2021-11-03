package codeup.basic100;

import java.io.IOException;
import java.util.Scanner;

/*
두 개의 참(1) 또는 거짓(0)이 입력될 때,
하나라도 참이면 참을 출력하는 프로그램을 작성해보자.

하나라도 참일 경우 1을 출력하고, 그 외의 경우에는 0을 출력한다. 

1 1

1

*/

public class Codeup1055 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println( (a==1)||(b==1) ? 1 : 0);
    }
}
