package codeup;

import java.io.IOException;
import java.util.Scanner;

/*
두 개의 참(1) 또는 거짓(0)이 입력될 때,
모두 참일 때에만 참을 출력하는 프로그램을 작성해보자.

둘 다 참(1)일 경우에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.

1 1

1

*/

public class Codeup1054 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println( (a==1)&&(b==1) ? 1 : 0);
    }
}
