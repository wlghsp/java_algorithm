package codeup;

import java.io.IOException;
import java.util.Scanner;

/*
정수(0 ~ 100) 1개를 입력받아 0부터 그 수까지 순서대로 출력해보자.


4

0
1
2
3
4
*/

public class Codeup1077 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 0;
        while (start <= n) {
            System.out.println(start);
            start++;
        }
        
    }
}
