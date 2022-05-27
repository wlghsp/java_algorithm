package baekjoon.silverⅤ.Boj1789_수들의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());

        long sum = 0;
        long num = 1;
        long count = 0;
        while (sum < S) {
            sum += num;
            num++;
            count++;
        }
        // sum==S 일때는 count-1이 필요 없다.
        // S가 1일 때 도 sum==S인 경우라서 0이 출력된다.
        System.out.println(sum == S ? count : count - 1);

    }
}
