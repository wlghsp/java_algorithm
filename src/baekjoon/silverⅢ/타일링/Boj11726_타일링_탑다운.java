package baekjoon.silverⅢ.타일링;

/*
2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.

입력
첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)

출력
첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.

2

2

9

55
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11726_타일링_탑다운 {

    static long tile[];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        tile = new long[n+1];

        tile[1] =1;
        if (n > 1) tile[2] = 2;
        System.out.println(goTo(n));

    }


    // 탑다운 방식
    static long goTo(int n) {
        if (n==1) return 1;
        if (n==2) return 2;

        long a = tile[n-1] > 0 ? tile[n-1] : goTo(n-1);
        long b = tile[n-2] > 0 ? tile[n-2] : goTo(n-2);
        tile[n] = (a + b) % 10007;

        return tile[n];

    }
}
