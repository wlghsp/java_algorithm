package baekjoon.bronze.bronze2.boj1173_운동;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, m, M, T, R;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());  // 운동하는 시간
        m = Integer.parseInt(st.nextToken()); // 초기 맥박 그리고 하한선
        M = Integer.parseInt(st.nextToken()); // 맥박 상한선
        T = Integer.parseInt(st.nextToken()); // T만큼 1분마다 맥박 증가
        R = Integer.parseInt(st.nextToken()); // 휴식에 R만큼 감소

        if ((M - m) < T) {
            System.out.println("-1");
            return;
        }

        int pulse = m;
        int totalTime = 0;

        while (N != 0) {

            if ((pulse + T) <= M) { // 운동 가능 T 증감
                pulse += T;
                N--;
            } else { // 운동 불가
                if ((pulse - R) < m) { // 하한선 밑이면 m, 하한선 위라면 R 차감
                    pulse = m;
                } else {
                    pulse -= R;
                }
            }

            totalTime++;
        }

        System.out.println(totalTime);
    }
}
