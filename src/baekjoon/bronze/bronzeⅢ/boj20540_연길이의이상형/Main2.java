package baekjoon.bronze.bronzeⅢ.boj20540_연길이의이상형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    static char[][] MBTI = {
            {'E', 'I'},
            {'S', 'N'},
            {'T', 'F'},
            {'J', 'P'}

    };
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        char[] input = br.readLine().toCharArray();

        for (int i = 0; i < MBTI.length; i++) {
            for (int j = 0; j < MBTI[i].length; j++) {
                if (input[i] == MBTI[i][j]) continue;
                else sb.append(MBTI[i][j]);
            }
        }
        System.out.println(sb);
    }
}
