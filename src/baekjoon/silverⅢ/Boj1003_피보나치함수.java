package baekjoon.silverⅢ;



/*

3
0
1
3

1 0
0 1
1 2

2
6
22

5 8
10946 17711

*/


/**
 * https://st-lab.tistory.com/123
 *  동적계획법이란 
 *  어떤 주어진 문제들을 작은 문제로 쪼개서 풀어나감에 있어 반복되는 호출을 줄이는 방법
 * 
 *  두가지 방식으로 나뉨, 재귀(Top-Down) 방식, 반복문(Bottom-Up) 방식
 *  
 *  재귀 방식은 큰 문제를 하위 문제로 쪼개어 가장 하위의 문제부터 풀어나가는 방법
 *  다른점: 동적계획법은 " 반복되는 문제는 한 번만 푼다"
 *  이미 풀렸던 값을 재활용한다. 
 *  이미 풀린 하위 문제를 다시 풀지 않고 재활용하는 것은 메모이제이션(Memoization)이라고 함. 
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Boj1003_피보나치함수 {

    static int[] result = new int[41]; // 이미 계산된 값 저장을 위한 배열 

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        // 미리 계산하여 저장함. 
        result[0] = 0;
        result[1] = 1;
        result[2] = 1;

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                System.out.println("1 0");
            } else if (n==1) {
                System.out.println("0 1");
            } else {
                fibonacci(n);
                System.out.println(result[n-1] +" " + result[n]);
            }
        }
    }

        static int fibonacci(int n) {
            if (n == 0) {
                return 0;
            } else if (n==1) {
                return 1;
            } else {
                // 메모이제이션 
                if (result[n]!=0) { // 이미 계산되어 저장된 값이라면 그 값을 리턴한다. 
                    return result[n];
                } else{
                    result[n] = fibonacci(n-1) + fibonacci(n-2); // 계산해서 저장한다. 
                    return result[n];
                }
            }
        }
    
}
