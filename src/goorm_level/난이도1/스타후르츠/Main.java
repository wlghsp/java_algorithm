package goorm_level.난이도1.스타후르츠;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 여름의 일 수
        int T = Integer.parseInt(st.nextToken()); // 스타후르츠가 자라는데 걸리는 일 수
        int C = Integer.parseInt(st.nextToken()); // 스타후르츠를 심을 수 있는 칸의 수
        int P = Integer.parseInt(st.nextToken()); // 스타후르츠 개당 가격

        System.out.println(((N-1) / T * C) * P);


    }
}
