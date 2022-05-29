package baekjoon.silverⅠ.Boj14888_연산자끼워넣기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N; // 정수의 개수
    static int[] arr;
    static int[] operators = new int[4]; // 0: 덧셈, 1:뺄셈, 2: 곱셈, 3: 나눗셈
    static int MAX = Integer.MIN_VALUE, MIN = Integer.MAX_VALUE;

    public static void dfs(int num, int idx) {
        if (idx == N){
            MAX = Math.max(MAX, num);
            MIN = Math.min(MIN, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            // 연산자 개수가 1개 이상인 경우
            if (operators[i] > 0) {
                operators[i]--;  // 연산자를 사용할 것이기에 1을 빼준다.

                switch (i) {
                    case 0:
                        dfs(num + arr[idx], idx + 1);
                        break;
                    case 1:
                        dfs(num - arr[idx], idx + 1);
                        break;
                    case 2:
                        dfs(num * arr[idx], idx + 1);
                        break;
                    case 3:
                        dfs(num / arr[idx], idx + 1);
                        break;
                }

                // 사용한 연산자를 다음 dfs에서 사용할 수 있도록 다시 되돌려준다.
                operators[i]++;
            }
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operators[i] = Integer.parseInt(st.nextToken());
        }
        dfs(arr[0], 1);
        StringBuilder sb = new StringBuilder();
        sb.append(MAX).append('\n');
        sb.append(MIN);
        System.out.println(sb);

    }
}
