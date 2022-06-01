package baekjoon.silverⅤ.Boj1292_쉽게푸는문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main2 {

    // 2. 숫자를 넣어 놓고 구간합을 구한다

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        int cnt = 1;
        list.add(0);
        for (int i = 0; i < (b+1)/2; i++) {
            for (int j = 0; j < cnt; j++) {
                list.add(cnt);
            }
            cnt++;
        }

        for (int i = 1; i < b+1; i++) {
            list.set(i, list.get(i) + list.get(i - 1));
        }
        System.out.println(list.get(b) - list.get(a-1));

    }
}
