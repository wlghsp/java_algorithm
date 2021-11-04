package codeup.simple_loop;

/*
구글 입사 시험으로 1 ~ 1,000,000까지 1의 개수를 묻는 문제가 나온적이 있다.
우리는 이 문제를 풀기에는 아직 힘이 든다.
우리는 이 문제를 조금 쉽게 바꾸어 풀려고한다.

어떤 수 n이 주어지면 1부터 n까지의 수 중 맨 마지막 자리에 1이 몇 번 들어 있는지 알아내는 프로그램을 작성하시오.

입력
n이 입력된다. ( 1 <= n <= 1,000,000 )

출력
맨 마지막 자리에 1이 몇 번 들어 있는지 출력한다.

입력 예시   
35

출력 예시
4

*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Codeup1270 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringBuilder sb = new StringBuilder();
        // StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i% 10 == 1) count++;
        }
        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
