package java_study.codingtest.입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutputEx1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 첫번째 N 문자 입력 받기

        String[] str = new String[N]; // N 크기의 String  배열 생성

        for (int i = 0; i < N; i++) { // String 배열에 입력 받은 문자 담기
            str[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) { // String 배열에 담긴 문자 출력
            System.out.println(str[i] + " ");
        }
    }
}
