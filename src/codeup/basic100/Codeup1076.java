package codeup.basic100;

import java.io.IOException;
import java.util.Scanner;

/*
영문자(a ~ z) 1개가 입력되었을 때 그 문자까지의 알파벳을 순서대로 출력해보자.


f

a b c d e f
*/

public class Codeup1076 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char start = 'a';
        char alpha = sc.nextLine().charAt(0);
        // do {
        //     System.out.println(start);
        //     start += 1;
        // } while (start <= alpha);
        
        while (start <= alpha) {
            System.out.println(start);
            start +=1;
        }
    }
}
