package baekjoon.bronze.bronze3.boj30802_웰컴키트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();

        int total = N;
        while (total > 0) {
            int num = Integer.parseInt(st.nextToken());
            list.add(num);
            total -= num;
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken()); // 티셔츠의 묶음 단위
        int P = Integer.parseInt(st.nextToken()); // 펜의 묶음 단위

        int answer1 = 0;

        for (int i : list) {
            answer1 += i % T == 0 ? i / T : i / T + 1;
        }

        System.out.println(answer1);

        System.out.println(N / P + " " + N % P);
    }
}
