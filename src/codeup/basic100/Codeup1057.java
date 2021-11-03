package codeup.basic100;

import java.io.IOException;
import java.util.Scanner;

/*
두 개의 참(1) 또는 거짓(0)이 입력될 때,
참/거짓이 서로 같을 때에만 참이 계산되는 프로그램을 작성해보자. 


0 0

1

*/

public class Codeup1057 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println( (a==1 && b==1)||(a==0 && b==0) ? 1 : 0);
    }
}
