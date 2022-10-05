package baekjoon.bronze.bronzeⅡ.Boj2605_줄세우기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            list.add(list.size() - tmp, i);
        }
        StringBuilder sb = new StringBuilder();
        for (Integer x : list) {
            sb.append(x).append(" ");
        }

        System.out.println(sb);
    }
}
