package codeup.basic100;

import java.io.IOException;
import java.util.Scanner;

/*
평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자.

평가 내용
평가 : 내용
A : best!!!
B : good!!
C : run!
D : slowly~
나머지 문자들 : what?


A

best!!

*/

public class Codeup1069 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if (a.equals("A")) {
            System.out.println("best!!!");
        } else if ((a.equals("B"))) {
            System.out.println("good!!");
        } else if (a.equals("C")) {
            System.out.println("run!");
        } else if (a.equals("D")) {
            System.out.println("slowly~");
        } else {
            System.out.println("what?");
        }
    }
}
