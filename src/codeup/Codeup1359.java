package codeup;

/*
n이 입력되면 n층의 별 계단을 출력하시오.
예) n= 5인 경우,

**
 **
  **
   **
    **

입력
계단의 높이 n이 정수로 입력된다.( 1<= n <= 100)

출력
n층의 별 계단을 출력한다.(n이 1일 경우 **을 출력한다.)

입력 예시   
3

출력 예시
**
 **
  **

*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Codeup1359 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
