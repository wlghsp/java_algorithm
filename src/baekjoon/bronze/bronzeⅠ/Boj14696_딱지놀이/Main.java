package baekjoon.bronze.bronzeⅠ.Boj14696_딱지놀이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] arr_a = new int[n];
            for (int j = 0; j < n; j++) {
                arr_a[j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int[] arr_b = new int[m];
            for (int j = 0; j < m; j++) {
                arr_b[j] = Integer.parseInt(st.nextToken());
            }

            HashMap<Integer, Integer> hm_a;
            hm_a = counter(arr_a);
            HashMap<Integer, Integer> hm_b;
            hm_b = counter(arr_b);
            int idx = 4;

            while (idx > 0) {
                if (hm_a.get(idx) > hm_b.get(idx)) {
                    sb.append("A").append('\n');
                    break;
                } else if (hm_a.get(idx) < hm_b.get(idx)) {
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

    public static HashMap<Integer, Integer> counter(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 1; i < 5; i++) {
            hm.put(i, 0);
        }
        for (int i : arr) {
            hm.put(i, hm.get(i) + 1);
        }
        return hm;

    }
}
