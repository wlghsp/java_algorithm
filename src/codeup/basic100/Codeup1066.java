package codeup.basic100;

import java.io.IOException;
import java.util.Scanner;

/*
세 정수 a, b, c가 입력되었을 때, 짝(even)/홀(odd)을 출력해보자.


1 2 8

odd
even
even

*/

public class Codeup1066 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        if (b % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        if (c % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
       
        
    }
}
