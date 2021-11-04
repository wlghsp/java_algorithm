package codeup.simple_loop;

/*
근제는 대기업 CSH의 회장이다.
최근 기업의 이미지가 좋지 않아 근제는 가난한 사람들에게 기부를 하려고 한다.
그런데 근제는 특이한 방법으로 기부를 했는데, 기부할 사람들을 번호 순으로 일정한 규칙에 따라 돈을 준다고 한다.
규칙은 다음과 같다
1, 10, 2, 20, 3, 30, 4, 40, 5, 50, 6, 60, 7, 70, 8, 80, 9, 90, 10, 100, 11, 110, 12, 120, ...
한편, 가난한 존과 밥은 돈을 받기 위해 신청을 했다.
존의 번호(k), 밥의 번호(h)가 주어질때 존과 밥이 받는 기부금의 합을 구하시오.

입력
한 줄에 k, h가 공백으로 분리되어 순서대로 입력된다.

출력
존과 밥이 받는 금액의 합을 출력한다.

입력 예시   
1 2

출력 예시
11

8318 346

43320


*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Codeup1272 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        if (k % 2 == 0) {
            k = k * 5; 
        } else {
            k = (k/2) + 1;
        }
        if (h % 2 == 0) {
            h = h * 5; 
        } else {
            h = (h/2) + 1;
        }
        int sum = k + h;
        bw.write(sum + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
