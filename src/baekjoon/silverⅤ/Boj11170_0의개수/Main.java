package baekjoon.silverⅤ.Boj11170_0의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

//    public static long countChar(String str, char ch){
//        return str.chars().filter(c -> c == ch).count();
//    }


    // 위 스트림보다 이게 더 빠름
    public static int countChar(String str, char ch){
        // 전체길이에서 replace로 저 문자들을 제거한 후 문자열 길이의 차를 반환
        return str.length() - str.replace(String.valueOf(ch), "").length();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for (int j = n; j < m+1; j++) {
                cnt += countChar(String.valueOf(j), '0');
            }

            sb.append(cnt).append('\n');
        }

        System.out.println(sb);
    }
}
