package codeup.simple_loop;

/*
시작 알파벳과 마지막 알파벳을 입력받아 그 두 알파벳 사이의 모든 알파벳을 출력하시오.

예)

a f   ====> a b c d e f  

입력
시작 알파벳과 마지막 알파벳을 공백으로 띄워 입력받는다.(소문자만 입력되고, 사전순으로 입력된다.)

출력
두 알파벳 사이의 모든 알파벳을 출력한다.

입력 예시   
d g

출력 예시
d e f g 
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Codeup1254 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = (int) st.nextToken().charAt(0); //  String을 char로 변환하고 다시 int로 변환함. 
        int b = (int) st.nextToken().charAt(0);
        
        for (int i = a; i <= b; i++) { 
            sb.append((char)i).append(" "); // int a, b 값으로 for문을 돌리고, i는 char로 변환하여 알파벳 출력 
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
