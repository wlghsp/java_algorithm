package baekjoon.bronze.bronzeⅡ.Boj13300_방배정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        double[][] student = new double[2][7];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            student[s][y] += 1;
        }

        int room = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 7; j++) {
                room += Math.ceil(student[i][j] / K);
            }
        }
        System.out.println(room);

    }
}
