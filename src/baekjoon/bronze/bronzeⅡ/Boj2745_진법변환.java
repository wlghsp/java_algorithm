package baekjoon.bronze.bronzeⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2745_진법변환 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        // 어떤 진수든 10진수로 바꾸는 방법은 똑같다.
        // 각 자리의 10진수 숫자 * 진수의 각 자리수 제곱을 모두 더한 값이다.

        long result = 0;
        int idx = 0; // 승 0, 1, 2, 3....
        int num = 0;  // 계산하기 위해 각 자리 숫자를 10진수로 바꿔준다.
        for (int i = n.length()-1; i >= 0; i++) {
            char c = n.charAt(i);

            if (c >= '0' && c <= '9') {
                num = c- '0';
            } else {
                num = c - 55;
            }

            result += num * Math.pow(b, idx++);
        }
        System.out.println(result);
    }


}
