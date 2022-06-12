package baekjoon.bronze.bronzeⅠ.Boj14696_딱지놀이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] arr_a = new int[5];
            for (int j = 0; j < n; j++) {
                arr_a[Integer.parseInt(st.nextToken())]++;
            }
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int[] arr_b = new int[5];
            for (int j = 0; j < m; j++) {
                arr_b[Integer.parseInt(st.nextToken())]++;
            }


            int idx = 4;
            while (idx > 0) {
                if (arr_a[idx] > arr_b[idx]) {
                    sb.append("A").append('\n');
                    break;
                } else if (arr_a[idx] < arr_b[idx]) {
                    sb.append("B").append('\n');
                    break;
                } else {
                    idx--;
                }
            }
            if (idx == 0) sb.append("D").append('\n');
        }

        System.out.println(sb);

    }


}
