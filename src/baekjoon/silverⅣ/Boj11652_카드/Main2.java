package baekjoon.silverⅣ.Boj11652_카드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] cards = new long[N];
        for (int i = 0; i < N; i++) {
            cards[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(cards);

        // cnt = 같은 수의 숫자카드 개수를 셈 (적어도 1장 이상이므로 1로 초기화)
        // Max = 같은 수가 가장 많은 숫자카드의 개수를 저장. => 적어도 1장 이상이므로 Max값도 1로 초기화
        int cnt = 1, max = 1;
        // 카드의 개수가 1인경우에는 card[0]이 답이 되므로 ans = card[0] 으로 초기화
        long ans = cards[0];

        for (int i = 1; i < N; i++) {
            // 정렬되어 있기 때문에 그 숫자의 갯수를 알 수 있다.
            if (cards[i] == cards[i-1]) {  // 숫자가 같다면 갯수를 늘려준다
                cnt++;  // 개수를 하나 올림
            } else { // 다르다면 다시 1개로 바꾼다
                cnt = 1; //개수는 1로 유지
            }
            // 만약에 같은 카드의 개수(cnt)가 이전까지의 Max값보다 크다면
            if (max < cnt) { // 최대갯수보다 크면 최대갯수를 바꾸고, 값도 현재 인덱스의 값으로 바꾼다.
                max = cnt;
                ans = cards[i];
            }
        }

        System.out.println(ans);


    }
}
