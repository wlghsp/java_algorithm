package codeup.basic100;

import java.io.IOException;
import java.util.Scanner;

/*
정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.


5

4
3
2
1
0
*/

public class Codeup1075 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        while (n !=0) {
            n--;
            System.out.println(n);
        }
        
    }
}
