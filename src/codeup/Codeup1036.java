package codeup;

import java.io.IOException;
import java.util.Scanner;

/*
영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력해보자.

*/

public class Codeup1036 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char num = sc.nextLine().charAt(0);
        System.out.print((int)num);
    }
}
