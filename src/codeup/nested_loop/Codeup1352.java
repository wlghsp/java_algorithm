package codeup.nested_loop;

/*
길이 n이 입력되면 길이가 n인 사각형을 출력하시오.

단, 사각형은 * 모양으로 채운다.

입력
사각형의 길이 n이 입력된다.

출력
가로 세로 길이 n인 사각형을 출력한다.

입력 예시   
4

출력 예시
****
****
****
****

*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Codeup1352 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
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
