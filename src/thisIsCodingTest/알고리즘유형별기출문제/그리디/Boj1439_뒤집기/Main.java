package thisIsCodingTest.알고리즘유형별기출문제.그리디.Boj1439_뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        /*
        전부 0으로 바꾸는 경우와 전부 1로 바꾸는 경우 중에서 더 적은 횟수를 가지는 경우를
        계산하고 서로 비교해서 최솟값을 출력한다.
         */

        int count0 = 0; // 전부 0으로 바꾸는 경우
        int count1 = 0; // 전부 1로 바꾸는 경우

        if (s.charAt(0) == '1') count0++;
        else count1++;

        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i+1)) {
                if (s.charAt(i+1) == '1') count0++;
                else count1++;
            }
        }

        System.out.println(Math.min(count0, count1));


    }
}
