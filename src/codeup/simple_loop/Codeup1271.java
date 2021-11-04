package codeup.simple_loop;

/*
입력의 개수 n이 입력되고 n개의  데이터가 입력된다.
이 n개의 데이터 중 최대값을 출력한다.

입력
첫째줄에 정수의 개수 N이 주어진다. (n<=1000)
둘째줄에 N개의 정수가 공백으로 분리되어 주어진다.  ( 0 <= 각각의 데이터 <=1000000 )

출력
N개의 정수 중 최대값을 찾아 출력한다.

입력 예시   
5
3 1 29 31 21

출력 예시
31

*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Codeup1271 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (temp > max) {
                max= temp;
            }
        }
        bw.write(max + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
