package codeup;

import java.io.IOException;
import java.util.Scanner;

/*
10진수를 입력받아 16진수(hexadecimal)로 출력해보자.

*/

public class Codeup1033 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.printf("%X", num);
    }

}
