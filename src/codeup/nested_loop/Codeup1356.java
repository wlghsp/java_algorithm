package codeup.nested_loop;

/*
길이 n이 입력되면 다음과 같은 사각형을 출력한다.

예)
n이 5일때
*****
*   *
*   *
*   *
*****

입력
길이 n이 입력된다. (n >= 3)

출력
사각형을 출력한다.

입력 예시   
3

출력 예시
***
* *
***

*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//  초기식 -> 조건식 -> 수행문 -> 증감식 -> 조건식 -> 수행문 -> 증감식

public class Codeup1356 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        for (int j = 0; j < n; j++) { // 윗면 그리는 for문
            sb.append("*");
        }
        sb.append("\n");
        for (int i = 0; i < n-2; i++) { // 중간 * + 공백 + * 그리는 for문 공백의 갯수 및 줄 수는 n-2개
            sb.append("*");
            for (int j = 0; j < n-2; j++) {
                sb.append(" ");
            }
            sb.append("*\n");
        }
        for (int j = 0; j < n; j++) { // 아랫면 그리는 for문
            sb.append("*");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
