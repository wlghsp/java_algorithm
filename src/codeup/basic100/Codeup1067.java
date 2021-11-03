package codeup.basic100;

import java.io.IOException;
import java.util.Scanner;

/*
정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.

-2147483648

minus
even

*/

public class Codeup1067 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println("plus");
        } else {
            System.out.println("minus");
        }
        
        
        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        
        
    }
}
