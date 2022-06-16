package baekjoon.bronze.bronzeⅠ.Boj5533_유니크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int count(List<Integer> nums, int num){
        int cnt = 0;
        for (int i : nums) {
            if (i == num) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] players = new int[N];

        int[][] scores = new int[N][3];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                scores[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        List<List<Integer>> cols = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cols.add(new ArrayList<>());
        }

        List<Integer> row;
        for (int i = 0; i < 3; i++) {
            row = cols.get(i);
            for (int j = 0; j < N; j++) {
                row.add(scores[j][i]);
            }
        }


        List<Integer> r;
        for (int i = 0; i < 3; i++) {
            r = cols.get(i);
            for (int j = 0; j < N; j++) {
                if (count(r, r.get(j)) == 1) {
                    players[j] += r.get(j);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i : players) {
            sb.append(i).append('\n');
        }
        System.out.println(sb);


    }
}
