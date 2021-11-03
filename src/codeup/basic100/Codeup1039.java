package codeup.basic100;

import java.io.IOException;
import java.util.Scanner;

/*
정수 2개를 입력받아 합을 출력해보자.
단, 입력되는 정수는 -2147483648 ~ +2147483648 이다.

*/

public class Codeup1039 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        Long b = sc.nextLong();
        System.out.print(a + b);
    }
}
