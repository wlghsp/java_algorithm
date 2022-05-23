package baekjoon.silverⅣ.Boj10816_숫자카드2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static HashMap<Integer, Integer> map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] cards = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);

        int M = Integer.parseInt(br.readLine());
        int[] candidate = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            candidate[i] = Integer.parseInt(st.nextToken());
        }

        map = new HashMap<>();

        for (int c : cards) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i : candidate) {
            sb.append(bsearch(cards, i, 0, cards.length-1)).append(' ');
        }
        System.out.println(sb);

    }

    public static int bsearch(int[] arr, int target, int start, int end) {
        if (start > end) { // 못 찾았다면 0을 반환
            return 0;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == target) {
            return map.get(target);
        } else if (arr[mid] < target) {
            return bsearch(arr, target, mid+1, end);
        } else {
            return bsearch(arr, target, start, mid -1);
        }
    }
}
