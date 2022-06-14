package baekjoon.bronze.bronzeⅠ.Boj2999_비밀이메일;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String message = br.readLine();
        int length = message.length();
        int R = 1, C = length;
        char[] chars = message.toCharArray();
        for (int i = 2; i < length; i++) {
            if (i * i > length) break;
            if (length % i == 0) {
                R = i;
                C = length / i;
            }
        }
        StringBuilder sb = new StringBuilder();
        /*
        행렬의 가로로 읽어야 하므로 행의 배수로 인덱스 이동
        행의 인덱스가 바깥쪽, 열의 인덱스 안 쪽

         */
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                sb.append(chars[j * R + i]);
            }
        }
        System.out.println(sb);

    }

}

