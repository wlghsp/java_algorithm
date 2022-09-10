package baekjoon.silverⅣ.Boj1748_수이어쓰기1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /*
    1~N까지 자릿수를 하나씩 더해가는 방법
    i % num == 0인 10, 100, 1000.. 에서 더하는 수인 plus를 증가시키고,
    num에도 10을 곱해서 다음 증가지점의 수를 만들어준다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0; // 자릿수
        int plus = 1;  // 자릿수에 더하는 값
        int num = 10;  // 몇 자릿수 더할지 판단
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            // 자릿수 바뀌는 조건 => 10, 100, 1000, 10000, ....
            if(i % num == 0) {
                plus++;
                num *= 10;
            }
            count += plus;
        }
        System.out.println(count);
    }
}
