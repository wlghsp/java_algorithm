package baekjoon.silverⅣ.Boj1049_기타줄;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] six_list = new int[M][2];


        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            six_list[i][0] = Integer.parseInt(st.nextToken());
            six_list[i][1] = Integer.parseInt(st.nextToken());
        }
        int[][] one_list = six_list.clone();
        Arrays.sort(six_list, Comparator.comparingInt(o -> o[0]));
        Arrays.sort(one_list, Comparator.comparingInt(o -> o[1]));
        int answer = 0;

        if (six_list[0][0] <= one_list[0][1] * 6) {
            answer = six_list[0][0] * (N/6) + one_list[0][1] *(N % 6);
            if (six_list[0][0] < one_list[0][1] *(N % 6)) {
                answer = six_list[0][0] * (N/6 + 1);
            }
        } else {
            answer = one_list[0][1] * N;
        }

        System.out.println(answer);
    }
}
