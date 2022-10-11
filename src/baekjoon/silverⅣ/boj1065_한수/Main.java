package baekjoon.silverⅣ.boj1065_한수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        // 1000보다 작거나 같은 자연수 N이므로 해당 1000까지 들어오는 경우를 고려해야 함
        for (int i = 1; i <= N; i++) {
            if (i < 100) cnt++; // 100 보다 작은 경우는 모두 한수
            else if (isHansu(i)) cnt++;
        } // 1000은 한수가 아님
        System.out.println(cnt);
    }

    private static boolean isHansu(int x) {
        String numStr = x + "";
        int hun = numStr.charAt(0);
        int ten = numStr.charAt(1);
        int one = numStr.charAt(2);
        return hun - ten == ten - one ? true: false;
    }
}
