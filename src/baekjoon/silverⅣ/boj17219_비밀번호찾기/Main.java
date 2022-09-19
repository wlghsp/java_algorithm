package baekjoon.silverⅣ.boj17219_비밀번호찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    /*
        눈을 감고 키보드를 막 쳐서 나온 두 문자열에서 공통으로 존재하는 가장 긴 부분 문자열 : 비밀번호
        비밀번호 찾는 프로그램 만들기
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String url = st.nextToken();
            String pw = st.nextToken();
            map.put(url, pw);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String site = br.readLine();
            sb.append(map.get(site)).append("\n");
        }

        System.out.println(sb);
    }
}
