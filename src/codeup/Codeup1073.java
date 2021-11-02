package codeup;

import java.io.IOException;
import java.util.Scanner;

/*
정수가 순서대로 입력된다.
-2147483648 ~ +2147483647, 단 개수는 알 수 없다.

0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.


7 4 2 3 0 1 5 6 9 10 8

7
4
2
3
*/

public class Codeup1073 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        while (true)  {
            int n = sc.nextInt();
            if (n == 0) {
                    break;
            }
            System.out.println(n);
    }
        
    }
}
