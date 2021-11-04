package codeup.simple_loop;

/*
고블린 파이터 동우는 구구단에 관심이 많다.
구구단의 원하는 단을 입력하면 그 단의 구구단이 출력되게 하시오.
예) 3
3*1=3
3*2=6
3*3=9
...
3*9=27

입력
입력으로 원하는 단이 입력된다( 단: 1~9)

출력
출력양식에 맞추어 출력한다.

입력 예시   
3

출력 예시
3*1=3
3*2=6
3*3=9
3*4=12
3*5=15
3*6=18
3*7=21
3*8=24
3*9=27

*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Codeup1265 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        // StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 9; i++) {
            sb.append(n + "*" + i +"=" + (n*i) + "\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
