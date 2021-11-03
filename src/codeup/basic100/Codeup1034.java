package codeup.basic100;

import java.io.IOException;
import java.util.Scanner;

/*
8진수로 입력된 정수 1개를 10진수로 바꾸어 출력해보자.

참고
%o로 입력받으면 8진수로 인식시켜 저장시킬 수 있다.
%d로 출력하면 10진수로 출력된다.
*/

public class Codeup1034 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int a = Integer.valueOf(num, 8);
        System.out.print(a);
    }
}
