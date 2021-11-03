package codeup.basic100;

import java.io.IOException;
import java.util.Scanner;

/*
정수 3개를 입력받아 합과 평균을 출력해보자.
단, -2147483648 ~ +2147483647 

1 2 3

6
2.0

*/

public class Codeup1046 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum3 = a + b+ c;
        // double answer = (double) sum3 /3; // (double) double 타입으로 변형하여 연산 진행 후 double 타입에 저장
        double answer =  (sum3*1.0) /3; // 정수 연산을 소수점 출력하는 방법으로 1.0을 곱해서 double형 데이터로 변경해준 뒤 double 타입에 저장
        System.out.println(a+b+c);
        System.out.printf("%.1f", answer);
       
    }
}
