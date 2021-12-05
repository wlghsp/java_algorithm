package codeplus;

import java.util.Scanner;

public class Boj4375_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {  // 값이 들어 올때마다 진행
            int n = sc.nextInt();
            int num = 0;
            for (int i = 1; ; i++) {
                num = num * 10 + 1;  // num은 전단계의 나머지
                num %= n; //  n으로 나눈 나머지
                if (num == 0) { // 나머지가 0이라면 이를 출력하고 탈출
                    System.out.println(i);
                    break;
                }
            }
        }

    }
}
