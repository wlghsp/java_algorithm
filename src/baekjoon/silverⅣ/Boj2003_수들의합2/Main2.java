package baekjoon.silverⅣ.Boj2003_수들의합2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0, lt = 0, total = 0;

        for (int rt = 0; rt < N; rt++) {
            total += arr[rt];
            if (total == M) answer++;
            while (total >= M) {
                total -= arr[lt++];
                if (total==M) answer++;
            }
        }

        System.out.println(answer);



    }
}
