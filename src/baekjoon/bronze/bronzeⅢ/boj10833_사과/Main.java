package baekjoon.bronze.bronzeⅢ.boj10833_사과;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 남는 사과의 총 갯수 구하기
        int N = Integer.parseInt(br.readLine()); // 학교의 수
        int answer = 0;
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int students = Integer.parseInt(st.nextToken());
            int apples = Integer.parseInt(st.nextToken());
            answer += apples % students;
        }
        System.out.println(answer);
    }
}
