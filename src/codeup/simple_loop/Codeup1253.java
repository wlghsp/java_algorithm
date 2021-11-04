package codeup.simple_loop;

/*
어떤 두 수 a, b가 있을 때 두 수 사이의 모든 정수를 오름차순으로 출력하시오.

예를 들어, a=5 , b=10일 경우 5 6 7 8 9 10입니다.


입력
두 수 a, b가 입력으로 들어온다. ( a, b는 정수, a, b 중 어떤 수가 큰지 모름)

출력
a와 b 사이의 정수들을 오름차순으로 출력한다.

입력 예시   
3 8

출력 예시
3 4 5 6 7 8 

*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Codeup1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if (a > b) {
            for (int i = b; i <= a; i++) {
                sb.append(i + " ");
            }
        } else {
            for (int i = a; i <= b; i++) {
                sb.append(i + " ");
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
