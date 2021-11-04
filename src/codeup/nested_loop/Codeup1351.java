package codeup.nested_loop;




/*
시작단과 마지막 단을 입력하면

그 구간의 구구단을 출력하는 프로그램을 작성하시오.

예시)

입력 : 2 3

2*1=2
2*2=4
2*3=6
2*4=8
2*5=10
2*6=12
2*7=14
2*8=16
2*9=18
3*1=3
3*2=6
3*3=9
3*4=12
3*5=15
3*6=18
3*7=21
3*8=24
3*9=27

입력
시작 단과 마지막 단을 입력한다.(정수1~9)

출력
예시처럼 구구단을 출력한다.

입력 예시   
5 6

출력 예시
5*1=5
5*2=10
5*3=15
5*4=20
5*5=25
5*6=30
5*7=35
5*8=40
5*9=45
6*1=6
6*2=12
6*3=18
6*4=24
6*5=30
6*6=36
6*7=42
6*8=48
6*9=54


*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Codeup1351 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 9; j++) {
                sb.append(i + "*" + j + "=" + (i*j)).append("\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
