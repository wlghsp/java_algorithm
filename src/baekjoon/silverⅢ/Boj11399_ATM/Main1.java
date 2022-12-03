package baekjoon.silverⅢ.Boj11399_ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] p = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            p[i] = Integer.parseInt(st.nextToken());
        }
        // 삽입 정렬
        for (int i = 1; i < N; i++) {
            int tmp = p[i]; // 현재 선택된 값
            int prev = i - 1; // 이전 원소 탐색 인덱스
            while (prev >= 0 && p[prev] > tmp) {
                p[prev + 1] = p[prev]; // 탐색한 원소가 선택값보다 크다면, 탐색원소를 뒤로 미룬다.
                prev--;
            }
            // 탐색 완료  앞에는 선택된 값보다 큰 값이 없다는 의미
            p[prev + 1] = tmp;
        }

        int sum = 0;  // 총합
        int prev = 0; // 이전까지의 누적합
        for (int i = 0; i < N; i++) {
            sum += prev + p[i];
            prev += p[i];
        }
        System.out.println(sum);
    }
}
