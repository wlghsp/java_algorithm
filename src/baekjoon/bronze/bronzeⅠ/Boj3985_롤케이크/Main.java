package baekjoon.bronze.bronzeⅠ.Boj3985_롤케이크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int[][] people = new int[N][2];
        int[] rollCake = new int[L];

        int maxVal = 0;
        int expectedPerson = 0;
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int cake = k - p;
            if (cake > maxVal) {
                maxVal = cake;
                expectedPerson = i + 1;
            }
            people[i][0] = p;
            people[i][1] = k;
        }

        int answer = 0;
        int inReality = 0;
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = people[i][0] - 1; j < people[i][1]; j++) {
                if (rollCake[j] == 0) {
                    rollCake[j] = i + 1;
                    cnt++;
                }
            }
            if (cnt > answer) {
                answer = cnt;
                inReality = i + 1;
            }
        }

        System.out.println(expectedPerson);
        System.out.println(inReality);

    }
}
