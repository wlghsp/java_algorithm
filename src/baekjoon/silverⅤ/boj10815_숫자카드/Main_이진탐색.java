package baekjoon.silverⅤ.boj10815_숫자카드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_이진탐색 {

    static int[] cards;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        cards = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N ; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cards);

        int M = Integer.parseInt(br.readLine());
        int[] candidate = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            candidate[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i : candidate) {
            if (bsearch(i) >= 0) {
                sb.append(1).append(' ');
            } else {
                sb.append(0).append(' ');
            }
        }
        System.out.println(sb);
    }

    private static int bsearch(int num){
        int lo = 0;
        int high = cards.length - 1;

        while (lo <= high) {
            int mid = (lo+high) / 2;
            if (cards[mid] > num) {
                high = mid -1;
            } else if (cards[mid] < num ) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
