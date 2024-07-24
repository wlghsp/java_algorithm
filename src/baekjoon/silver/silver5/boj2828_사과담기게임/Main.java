package baekjoon.silver.silver5.boj2828_사과담기게임;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver5/boj2828_사과담기게임/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st   = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(br.readLine());

        int ans = 0;
        int start = 1;
        int end = start + M - 1;
        for (int i = 0; i < j; i++) {
            int apple = Integer.parseInt(br.readLine());
            if (end < apple) {
                // 오른쪽 이동
                ans += (apple - end);
                start += apple - end;
                end = apple;
            } else if (start > apple) {
                // 왼쪽 이동
                ans += (start - apple);
                end -= start - apple;
                start = apple;
            }
        }

        System.out.println(ans);
    }
}
