package baekjoon.bronze.bronzeⅢ.boj11109_괴짜교수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken()); // 병렬버전을 개발하는데 걸리는 시간
            int n = Integer.parseInt(st.nextToken()); // 다음 해 동안 이 프로그램이 실행되는 횟수
            int s = Integer.parseInt(st.nextToken()); // 직렬버전의 실행시간
            int p = Integer.parseInt(st.nextToken()); // 병렬버전의 실행시간

            int byungryul = d + n * p;
            int jikryul = n * s;
            if (byungryul < jikryul) {
                System.out.println("parallelize");
            } else if (jikryul < byungryul) {
                System.out.println("do not parallelize");
            } else {
                System.out.println("does not matter");
            }
        }
    }
}
