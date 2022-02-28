package baekjoon.bronze.bronzeⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOj11720_숫자의합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*int n = Integer.parseInt(br.readLine());
        char[] cArr = br.readLine().toCharArray();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (cArr[i] - '0');
        }
        System.out.println(sum);*/

        // 다른 사람 풀이
        br.readLine();
        int sum = 0;

        for(byte value: br.readLine().getBytes()) {
            sum += (value - '0');       //  또는 (a-48)
        }

        System.out.println(sum);
    }
}
