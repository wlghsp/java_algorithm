package codeup.basic100;

import java.io.IOException;
import java.util.Scanner;

/*
1(true, 참) 또는 0(false, 거짓) 이 입력되었을 때
반대로 출력하는 프로그램을 작성해보자.


1

0

*/

public class Codeup1053 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println( a == 1 ? 0 : 1);
    }
}
