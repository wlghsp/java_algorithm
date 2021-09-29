package baekjoon.bronzeⅢ;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class boj_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while (true) {

            String str = br.readLine();

            int a = str.charAt(0) - '0'; // '0'은 아스키코드 48
            int b = str.charAt(2) - 48;  // 48을 바로 뺄 수도 있다.

            if (a==0 && b==0) {
                break;
            }
            sb.append((a + b)).append('\n');
        }

        System.out.println(sb);
    }
}
/*
*
1 1
2 3
3 4
9 8
5 2
0 0
* */