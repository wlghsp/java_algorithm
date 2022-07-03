package inflearn.array_1_2차원배열.q20_등수구하기;


/**
 * 순위 알고리즘
 *  주어진 범위 데이터의 순위를 구하는 알고리즘인데,
 *
 *  순위를 보관할 배열을 추가로 하나 만들어서 해당 배열에 값별 순위를 넣어줘야 한다.
 *
 *  이후 for문을 돌리면서 해당 값의 순위를 1로 시작하고
 *  for문 안에서 for문을 한 번 더 돌리면서 배열의 i값과 다른 값(j)들을 비교하는데
 *  배열의 i값보다 큰 값이 있으면 i값보다 큰 값이 있으면 i값에 해당하는 순위 배열의 i값을 1씩 올려준다.
 */

import java.util.Scanner;

public class Main2 {
    private int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) cnt++;
            }
            answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : T.solution(n, arr)) {
            System.out.print(i + " ");
        }
    }
}
