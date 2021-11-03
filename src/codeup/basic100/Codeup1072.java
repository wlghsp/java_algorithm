package codeup.basic100;

import java.io.IOException;
import java.util.Scanner;

/*
n개의 정수가 순서대로 입력된다.
-2147483648 ~ +2147483647, 단 n의 최대 개수는 알 수 없다.

n개의 입력된 정수를 순서대로 출력해보자.

while( ), for( ), do~while( ) 등의 반복문을 사용할 수 없다.


5
1 2 3 4 5

1
2
3
4
5
*/

public class Codeup1072 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
                int n = sc.nextInt();
                System.out.println(n);
        }
    }
}
