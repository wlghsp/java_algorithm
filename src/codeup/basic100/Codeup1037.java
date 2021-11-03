package codeup.basic100;

import java.io.IOException;
import java.util.Scanner;

/*
10진 정수 1개를 입력받아 아스키 문자로 출력해보자.
단, 0 ~ 255 범위의 정수만 입력된다.

*/

public class Codeup1037 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print((char)num);
    }
}
