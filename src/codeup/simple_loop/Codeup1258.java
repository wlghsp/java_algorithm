package codeup.simple_loop;

/*
정수 n이 입력으로 들어오면 1부터 n까지의 합을 구하시오.

입력
입력으로 자연수 n이 입력된다.

출력
1부터 n까지의 합을 출력한다.

입력 예시   
100

출력 예시
5050

*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Codeup1258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        // StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        bw.write(sb.append(sum).toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
