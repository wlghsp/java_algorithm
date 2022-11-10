package baekjoon.bronze.bronzeⅡ.boj21313_문어;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        boolean odd = false;
        /*
        1 2 를 계속 붙여 나가는데
         양끝의 번호는 손을 맞잡으므로 같아서는 안된다.
         따라서 n 이 홀수인 경우 같아지므로 마지막에 3을 붙인다.
         */
        if (n % 2 == 1) {
           odd = true;
           n--;
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append(1).append(" ");
            } else {
                sb.append(2).append(" ");
            }
        }
        if (odd) {
            sb.append("3");
        }
        System.out.println(sb);
    }
}
