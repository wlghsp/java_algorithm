package codeup.nested_loop;

/*
n이 입력되면 다음 삼각형을 출력하시오.
예) n = 4
*
**
***
****
***
**
*

입력
n이 입력된다.

출력
예시에 설명된 것과 같은 삼각형을 출력한다.

입력 예시   
2
출력 예시
*
**
*

*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//  초기식 -> 조건식 -> 수행문 -> 증감식 -> 조건식 -> 수행문 -> 증감식

public class Codeup1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = n; i > 0; i--) {
            for (int j = i-1; j < n; j++) { 
                sb.append("*");
            }
            sb.append("\n");
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = i; j < n-1; j++) { 
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
