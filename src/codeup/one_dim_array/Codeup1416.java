package codeup.one_dim_array;

/*

어떤 10진수 n이 주어지면 2진수로 변환해서 출력하시오.
예)
10    ----->  1010
0    ----->  0
1    ----->  1
2    ----->  10
1024    ----->  10000000000

입력
10진수 정수 n이 입력된다.
(n은 21억이하의 임의의 수이다.)

출력
2진수로 변환해서 출력한다.

입력 예시   
7

출력 예시
111

*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Codeup1416 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        bw.write(Integer.toBinaryString(n));
        bw.flush();
        bw.close();
        br.close();
    }
}
