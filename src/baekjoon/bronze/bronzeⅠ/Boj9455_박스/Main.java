package baekjoon.bronze.bronzeⅠ.Boj9455_박스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int[][] boxes = new int[m][n];

            for (int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < n; k++) {
                    boxes[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            List<List<Integer>> cols = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                cols.add(new ArrayList<>());
            }

            List<Integer> row;
            for (int j = 0; j < n; j++) {
                row = cols.get(j);
                for (int k = 0; k < m; k++) {
                    row.add(boxes[k][j]);
                }
            }
            List<Integer> r;
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                r = cols.get(j);
                for (int k = 0; k < m; k++) {
                    if (r.get(k) == 1) {
                        cnt += countZero(k, r);
                    }
                }
            }
            System.out.println(cnt);
        }


    }

    private static int countZero(int i, List<Integer> r) {
        int cnt = 0;
        for (int j = i + 1; j < r.size(); j++) {
            if (r.get(j) == 0) {
                cnt++;
            }
        }
        return cnt;

    }

}
