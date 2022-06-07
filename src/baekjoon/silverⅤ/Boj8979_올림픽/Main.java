package baekjoon.silverⅤ.Boj8979_올림픽;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] countries = new int[N][4];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            countries[i][0] = Integer.parseInt(st.nextToken());
            countries[i][1] = Integer.parseInt(st.nextToken());
            countries[i][2] = Integer.parseInt(st.nextToken());
            countries[i][3] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(countries, (o1, o2) -> {
            if (o2[1] == o1[1]) {
                if (o2[2] == o1[2]) {
                    return o2[3] - o2[3];
                }
                return o2[2] - o2[2];
            }
            return o2[1] - o1[1];
        });



        System.out.println(Arrays.deepToString(countries));


    }
}
