package algorithm.codingtest.입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutputEx2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 첫번째 N 문자 입력 받기
        String str = br.readLine();

        for (int i = 0; i < N; i++) {
            System.out.println(str.charAt(i) + " ");
        }
    }
}
