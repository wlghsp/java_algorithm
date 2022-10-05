package baekjoon.bronze.bronzeⅠ.boj1292_쉽게푸는문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int i = 1;
        int sum = 0;
        int cnt = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (cnt <= B) {
            for (int j = 0; j < i; j++) {
                list.add(i);
                cnt++;
            }
            i++;
        }

        for (int j = A-1; j <= B-1; j++) {
            sum += list.get(j);
        }

        System.out.println(sum);
    }
}
