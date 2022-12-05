package baekjoon.bronze.bronzeⅢ.boj11966_2의제곱인가;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(twoN(N) ? 1 : 0);
    }
    public static boolean twoN(int n) {
        return (n & (n - 1)) == 0;
    }
    /*
      2의 n제곱수 판별
      2의 n제곱수를 2진수로 나타내면 1로 시작하고 오른쪽에 0으로 채워지는 형태
      여기서 1을 뺀 수를 2진수로 나타내면 0 제곱을 제외하고 2진수가 자리수가 하나 적고 1로만 이루어짐
      따라서 여기서 둘을 비트연산자 & 연산하면 2의 제곱수 인 경우 0이 나와야 한다.

      & AND연산 비트연산자는 둘 다 1이이여만 1이 된다.
      | OR연산  연산자는 둘 중에 하나만 1이여도 1이된다.
      ^ XOR연산 대응되는 비트가 서로 다르면 1을 반환
      ~ 비트 NOT 연산 비트를 1이면 0으로, 0이면 1로 반전 시킴
      << 지정한 수만큼 비트들을 전부 왼쪽으로 이동시킴 left shift 연산
      >> 지정한 수만큼 비트들을 전부 오른쪽으로 이동시킴 right shift 연산
     */
}
