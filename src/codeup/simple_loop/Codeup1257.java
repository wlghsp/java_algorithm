package codeup.simple_loop;

/*
시작수와 마지막 수가 입력되면
시작수부터 마지막 수까지의 모든 홀수를 출력하시오.

입력
두 수 a, b 가 입력된다. ( a <= b )

출력
a~b의 홀수를 모두 출력한다.

입력 예시   
2 7

출력 예시
3 5 7 

*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Codeup1257 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        for (int i = a; i <= b; i++) {
            if ( i % 2 != 0) {
                sb.append(i + " ");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
