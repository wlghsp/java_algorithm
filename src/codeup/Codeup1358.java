package codeup;

/*
어떤 수 n을 입력받으면 다음과 같은 삼각형을 출력한다.
여기서 입력되는 n은 반드시 홀수이다.

입력
3부터 99 까지의 홀수 중 하나가 입력된다.

출력
Sample Output 같은 삼각형을 출력한다.

입력 예시   
5

출력 예시
  *
 ***
*****

*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Codeup1358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n-2; i++) {
            for (int j = 0; j < n-3; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j += 2) {
                System.out.println("*");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
