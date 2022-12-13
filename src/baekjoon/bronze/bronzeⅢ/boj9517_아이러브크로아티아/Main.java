package baekjoon.bronze.bronzeⅢ.boj9517_아이러브크로아티아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine()); // 폭탄을 들고 있는 사람의 번호
        int N = Integer.parseInt(br.readLine());  // 질문의 갯수
        int person = K;
        int timespent = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            String z = st.nextToken();
            timespent += t;
            if (timespent >= 210) break;
            if (z.equals("T")) {
                person++;
                if (person == 9) person = 1;
            }
        }
        System.out.println(person);

    }
}
