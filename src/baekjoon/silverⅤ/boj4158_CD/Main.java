package baekjoon.silverⅤ.boj4158_CD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력은 여러 개의 테스트 케이스로 이루어져 있다.
        // 위와 같은 조건이 있으므로 0 0 이 나오기 전까지는 테스트 케이스가 반복된다는 의미였다.
        String str = null;
        while (!(str = br.readLine()).equals("0 0")) {
            StringTokenizer st = new StringTokenizer(str);
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[] cdNums1 = new int[N];
            int[] cdNums2 = new int[M];
            for (int i = 0; i < N; i++) {
                cdNums1[i] = Integer.parseInt(br.readLine());
            }
            for (int i = 0; i < M; i++) {
                cdNums2[i] = Integer.parseInt(br.readLine());
            }
            int cnt = 0;
            int left = 0;
            int right = 0;
            while (left < N && right < M) {
                if (cdNums1[left] == cdNums2[right]) {
                    cnt++;
                    left++;
                    right++;
                } else if (cdNums1[left] > cdNums2[right]) {
                    right++;
                } else {
                    left++;
                }
            }
            System.out.println(cnt);
        }

    }
}
