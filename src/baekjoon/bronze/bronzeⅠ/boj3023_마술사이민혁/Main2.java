package baekjoon.bronze.bronzeⅠ.boj3023_마술사이민혁;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        char[][] arr = new char[R * 2][C * 2];

        for (int i = 0; i < R; i++) {
            String line = br.readLine();
            for (int j = 0; j < C; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[i][2 * C - 1 - j] = arr[i][j];
            }
        }

        // 인텔리제이가 만들어 준 코드
        // System.arraycopy로 배열복사하여 넣는다.
        for (int i = 0; i < R; i++) System.arraycopy(arr[i], 0, arr[2 * R - 1 - i], 0, 2 * C);

        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()) - 1;
        int B = Integer.parseInt(st.nextToken()) - 1;

        if (arr[A][B] == '.') arr[A][B] = '#';
        else arr[A][B] = '.';
        StringBuilder sb = new StringBuilder();
        for (char[] chars : arr) {
            for(char c : chars) {
                sb.append(c);
            }
            sb.append('\n');
        }
        System.out.println(sb);

    }
}
