package baekjoon;



/*

다음 소스는 N번째 피보나치 수를 구하는 C++ 함수이다.

int fibonacci(int n) {
    if (n == 0) {
        printf("0");
        return 0;
    } else if (n == 1) {
        printf("1");
        return 1;
    } else {
        return fibonacci(n‐1) + fibonacci(n‐2);
    }
}

fibonacci(3)을 호출하면 다음과 같은 일이 일어난다.

    fibonacci(3)은 fibonacci(2)와 fibonacci(1) (첫 번째 호출)을 호출한다.
    fibonacci(2)는 fibonacci(1) (두 번째 호출)과 fibonacci(0)을 호출한다.
    두 번째 호출한 fibonacci(1)은 1을 출력하고 1을 리턴한다.
    fibonacci(0)은 0을 출력하고, 0을 리턴한다.
    fibonacci(2)는 fibonacci(1)과 fibonacci(0)의 결과를 얻고, 1을 리턴한다.
    첫 번째 호출한 fibonacci(1)은 1을 출력하고, 1을 리턴한다.
    fibonacci(3)은 fibonacci(2)와 fibonacci(1)의 결과를 얻고, 2를 리턴한다.

1은 2번 출력되고, 0은 1번 출력된다. N이 주어졌을 때, fibonacci(N)을 호출했을 때, 0과 1이 각각 몇 번 출력되는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 테스트 케이스는 한 줄로 이루어져 있고, N이 주어진다. N은 40보다 작거나 같은 자연수 또는 0이다.

출력
각 테스트 케이스마다 0이 출력되는 횟수와 1이 출력되는 횟수를 공백으로 구분해서 출력한

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

    static int[] result = new int[41];

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
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
                if (result[n]!=0) {
                    return result[n];
                } else{
                    result[n] = fibonacci(n-1) + fibonacci(n-2);
                    return result[n];
                }
            }
        }




    
}
