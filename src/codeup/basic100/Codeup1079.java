package codeup.basic100;

import java.io.IOException;
import java.util.Scanner;

/*
'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.


x b k d l q g a c

x
b
k
d
l
q
*/

public class Codeup1079 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            char c = sc.next().charAt(0);
            if (c =='q') {
                System.out.println(c);
                break;
            }
            System.out.println(c);
        }
    }
}
