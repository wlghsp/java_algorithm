package baekjoon.bronze.bronzeⅡ.Boj2711_오타맨고창영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int loc = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            sb.append(getString(str, loc)).append("\n");
        }
        System.out.println(sb);
    }

    public static String getString(String s, int l) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if(i != l - 1) result += s.charAt(i);
        }
        return result;
    }
}
