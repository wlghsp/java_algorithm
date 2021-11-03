package codeup.basic100;

import java.io.IOException;
import java.util.Scanner;

/*
정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.

5

6
*/

public class Codeup1078 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 0;
        int sumOf = 0;
        while (start <= n) {
            if (start % 2 == 0) {
                sumOf += start;
            }
            start++;
        }

        System.out.println(sumOf);
        
    }
}
