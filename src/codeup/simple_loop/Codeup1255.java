package codeup.simple_loop;

/*
별(*)을 n개 만큼 출력한다.

입력
별의 개수인 n이 입력된다.(1 <= n <=1000)

출력
별(*)을 개수만큼 출력한다.

입력 예시   
5

출력 예시
*****

*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Codeup1255 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        // StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            sb.append("*");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
