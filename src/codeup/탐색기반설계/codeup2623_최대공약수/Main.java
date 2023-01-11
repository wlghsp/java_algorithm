package codeup.탐색기반설계.codeup2623_최대공약수;

/*
두 정수 a, b를 입력받아서, a, b의 최대공약수를 출력하시오.

입력
정수 a, b가 공백으로 구분되어 입력된다.(1<=a,b<=10,000)

출력
a, b의 최대공약수를 출력한다.

입력 예시
64 128

출력 예시
64

 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(GCD(a, b));

    }
    static int GCD(int a, int b) {
        return b != 0 ? GCD(b, a % b) : a;
    }

}
