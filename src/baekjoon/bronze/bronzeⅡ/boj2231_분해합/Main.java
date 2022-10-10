package baekjoon.bronze.bronzeⅡ.boj2231_분해합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int N = Integer.parseInt(n);

        // 시작지점은 더할 수 있는 최댓의 자릿수 값들을 빼준다. 예를 들어 3자리면 9 + 9 + 9 보다 클 수는 없으므로
        // 더하는 수들은 9 + 9 + 9 보다 작은 경우에 해당된다.
        int start = N - n.length() * 9;

        int answer = 0;
        for (int i = start; i < N; i++) {
            String strNum = i + "";
            int num = i;
            for (int j = 0; j < strNum.length(); j++) {
                num += strNum.charAt(j) - '0';
            }
            if (num == N) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
