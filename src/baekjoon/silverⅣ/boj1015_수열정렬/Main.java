package baekjoon.silverⅣ.boj1015_수열정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] a = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int[] b = a.clone();
        Arrays.sort(b);
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int tmp = a[i];
            for (int j = 0; j < N; j++) {
                if (!list.contains(j) && tmp == b[j]){
                    list.add(j);
                    sb.append(j).append(" ");
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}
