package codeup.string;

/*
자연수 n이 입력되면 3의 배수인지 아닌지 판별하시오.

입력
입력은 자연수 n이 주어지며, 범위는 0<n<10500입니다.

출력
3의 배수이면 1을 출력하고, 아니면 0을 출력한다.

입력 예시   
3321

출력 예시
1

*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Codeup1990 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(br.readLine());
        n = n.remainder(BigInteger.valueOf(3));
        if (n.compareTo(BigInteger.valueOf(0)) == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
