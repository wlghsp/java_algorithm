package baekjoon.silverⅣ.boj9012_괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj9012_괄호_count {

    public static String solve(String s) {
        int count = 0;

        for (char c : s.toCharArray()) {

            // 여는 괄호일 경우 카운트 증가
            if (c == '(') {
                count++;
            }
            // 아래는 모두 닫는 괄호 일 경우들이다.

            // count 가 0인 경우. 즉, 닫는 괄호를 입력받았으나 pop할 원소가 없을 경우
            else if(count == 0) {
                return "NO";
            }
            // 그 외의 경우 count를 감소시킨다.
            else {
                count--;
            }
        }

        /*
         * 모든 검사 마치고 잔여 요소가 있으면(count > 0) 여는 괄호가 많은 경우는 "NO"
         * 요소가 비어있으면(count = 0) 온전한 수식이므로 "YES" 이다.
         */

        if (count == 0) {
            return "YES";
        } else {
            return "NO";
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0){
            sb.append(solve(br.readLine())).append("\n");
        }

        System.out.println(sb);

    }
}
