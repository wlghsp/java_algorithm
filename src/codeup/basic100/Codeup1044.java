package codeup.basic100;

import java.io.IOException;
import java.util.Scanner;

/*
정수를 1개 입력받아 1만큼 더해 출력해보자.
단, -2147483648 ~ +2147483647 의 범위로 입력된다.

*/

public class Codeup1044 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        System.out.print(a + 1);
    }
}
