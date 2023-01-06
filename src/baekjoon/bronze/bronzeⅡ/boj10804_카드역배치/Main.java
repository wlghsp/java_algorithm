package baekjoon.bronze.bronzeⅡ.boj10804_카드역배치;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] cards;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        cards = new int[21];
        for (int i = 1; i <= 20; i++) {
            cards[i] = i;
        }
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            reverse(a, b);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < cards.length; i++) {
            sb.append(cards[i]).append(" ");
        }
        System.out.println(sb);

    }

    private static void reverse(int a, int b) {
        int j = b;
        int[] cards2 = Arrays.copyOf(cards, cards.length);
        for (int i = a; i <= b; i++) {
            cards[i] = cards2[j--];
        }
    }
}
