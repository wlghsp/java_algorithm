package baekjoon.bronze.bronzeⅡ.Boj5032_탄산음료;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int e = Integer.parseInt(st.nextToken()); // 준민이가 가진 빈 병의 수
        int f = Integer.parseInt(st.nextToken()); // 그날 발견한 빈 병의 수
        int c = Integer.parseInt(st.nextToken()); // 새 병으로 바꾸는데 필요한 빈 병의 개수
        int emptyBottle = e + f;
        int result = 0;
        while (emptyBottle >= c) {
            int cnt = emptyBottle / c;
            int remain = emptyBottle % c;
            result += cnt;
            emptyBottle = cnt + remain;
        }
        System.out.println(result);
    }
}
