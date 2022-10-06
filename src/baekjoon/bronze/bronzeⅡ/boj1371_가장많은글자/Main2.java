package baekjoon.bronze.bronzeⅡ.boj1371_가장많은글자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;

        String str = "";
        // while의 조건문에 있는 것이 EOF 에러 해결 방법
        // null 값이 오지 않을 때만 반복한다는 반복문
        while ((input = br.readLine()) != null) {
            str += input;
        }

        int maxVal = 0;
        String result = "";

        // 소문자 알파벳 갯수만큼 반복하는 반복문을 만든다.
        // i가 97부터 122까지 인것은 아스키 코드 값으로 활용하기 위함
        // 소문자 알파벳의 아스키코드 값이 97부터 122까지 이다.
        for (int i = 97; i < 123;i++) {
            int cnt = str.length() - str.replace(String.valueOf(i), "").length();

            if (maxVal == cnt) { // 최댓값과 빈도가 같은 알파벳 더더해주기
                result += String.valueOf(i);
            }

            if (maxVal < cnt) { // 최댓값 교체
                maxVal = cnt;   // 최댓값 할당
                result = String.valueOf(i); // 최댓값에 해당하는 알파벳 할당
            }
        }

        System.out.println(result);
    }
}
