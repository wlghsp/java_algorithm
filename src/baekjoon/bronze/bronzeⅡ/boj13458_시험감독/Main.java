package baekjoon.bronze.bronzeⅡ.boj13458_시험감독;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 시험장의 갯수
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int cnt = N; // 총감독은 항상 들어가므로 총 시험장 갯수를 할당

        for (int i : arr) {
            i -= B;
            if (i > 0) {
                cnt += i / C;
                if (i % C != 0) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

    }
}
