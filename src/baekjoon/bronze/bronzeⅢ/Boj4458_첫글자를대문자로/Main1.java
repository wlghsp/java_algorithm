package baekjoon.bronze.bronzeⅢ.Boj4458_첫글자를대문자로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            sb.append(Character.toUpperCase(str.charAt(0)) + str.substring(1)).append("\n");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
