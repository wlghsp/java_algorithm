package baekjoon.bronze.bronzeⅢ.boj20361_일우는야바위꾼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] cups;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        cups = new int[N+1];
        for (int i = 1; i <= N; i++) {
            cups[i] = i;
        }

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            swap(cups, a, b);
        }

        for (int i = 1; i <= N; i++) {
            int num = cups[i];
            if (num == X) {
                System.out.println(i);
                break;
            }
        }

    }

    private static void swap(int[] cups, int a, int b) {
        int tmp = cups[a];
        cups[a] = cups[b];
        cups[b] = tmp;
    }
}
