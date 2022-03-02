package baekjoon.bronze.bronzeⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1924_2007년 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = y;

        for (int i = 0; i < x-1; i++) {
            days += months[i];
        }

        String[] answers = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        System.out.println(answers[days%7]);

    }
}
