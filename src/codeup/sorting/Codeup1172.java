package codeup.sorting;


/*
세 수를 오름차순으로 정렬하려고 한다. (낮은 숫자 -> 높은 숫자)
예)

5 8 2   ====> 2 5 8    로 출력

입력
세 정수가 입력된다.

출력
낮은 숫자 부터 출력한다.

입력 예시
8 7 6

출력 예시
6 7 8


3 5 7

도움말
 숫자가 같을 때도 생각하세요~

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Codeup1172 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int tmp;
        
        // 스왑으로 간단한 풀이
        if (b < a) {
            tmp = a; //b를 담기 전에 a값을 tmp에 담아두고
            a = b;  // b를 a에 넣어준다.
            b = tmp; // 다시 tmp에 할당된 a의 값을 b에 넣어서 스왑
        }

        if (c < a) {
            tmp = a;
            a = c;
            c = tmp;
        }

        if (c < b) {
            tmp = b;
            b = c;
            c = tmp;
        }
        System.out.printf("%d %d %d", a, b, c);


        // 내 풀이 
//        if (a >= b) {
//            if (b >= c) { // a >= b >=c
//                first = a;
//                second = b;
//                third = c;
//            } else { // a >= c > b
//                first = a;
//                second = c;
//                third = b;
//            }
//        } else {
//            if (a >= c) { // b > a >= c
//                first = b;
//                second = a;
//                third = c;
//            } else { // b > a, c > a
//                if (b >= c) { // b >= c > a
//                    first = b;
//                    second = c;
//                    third = a;
//                } else {
//                    first = c;
//                    second = b;
//                    third = a;
//                }
//            }
//        }
//        System.out.println(third +" " + second + " " + first);



    }
}
