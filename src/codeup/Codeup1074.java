package codeup;

import java.io.IOException;
import java.util.Scanner;

/*
정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
while(조건)
{
  ...
}
구조를 사용하자.


5

5
4
3
2
1
*/

public class Codeup1074 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        while (n !=0) {
            System.out.println(n);
            n--;
        }
        
    }
}
