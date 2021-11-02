package codeup;

import java.io.IOException;
import java.util.Scanner;

/*
정수 2개를 입력받아 합을 출력하는 프로그램을 작성해보자.
(단, 입력되는 정수는 -1073741824 ~ 1073741824 이다.)

*/

public class Codeup1038 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        Long b = sc.nextLong();
        System.out.print(a + b);
    }
}
