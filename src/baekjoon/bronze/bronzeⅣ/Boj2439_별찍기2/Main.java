package baekjoon.bronze.bronzeⅣ.Boj2439_별찍기2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /*
     java 11 부터는 스트링 반복을 repeat로 할 수 있음

    https://stackoverflow.com/questions/1235179/simple-way-to-repeat-a-string
    다양한 방법이 있긴 함
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < N + 1; i++) {
            sb.append(" ".repeat(N - i));
            sb.append("*".repeat(i));
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
