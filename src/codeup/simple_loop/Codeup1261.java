package codeup.simple_loop;

/*
10개의 수가 입력된다.
10개의 수 중 5의 배수를 하나만 출력한다.
만약 5의 배수가 없다면 0을 출력한다.


입력
10개의 자연수가 입력된다

출력
10개의 수 중 5의 배수가 있으면 그 중 하나만 출력하고, 없다면 0을 출력한다.

입력 예시   
1 2 3 4 5 6 7 8 9 10

출력 예시
5

*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Codeup1261 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int fiveNum = 0;
        for (int i = 0; i < 10; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (temp % 5 == 0) {
                fiveNum = temp;
                break;
            }
        }
        bw.write(fiveNum + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
