package codeup.nested_loop;

/*
길이 n이 입력되면 역삼각형을 출력한다.
예)
n이 5이면
*****
****
***
**
*

입력
길이 n이 입력된다.

출력
역삼각형을 출력한다.

입력 예시   
3

출력 예시
***
**
*

*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Codeup1354 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) { // 초기식 -> 조건식 -> 수행문 -> 증감식 -> 조건식 -> 수행문 -> 증감식
                sb.append("*");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
