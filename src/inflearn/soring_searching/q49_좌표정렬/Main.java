package inflearn.soring_searching.q49_좌표정렬;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int[][] solution(int n, int[][]  arr) {
        Arrays.sort(arr, (o1,o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        });
        return arr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[i][0] = x;
            arr[i][1] = y;
        }

        for (int[] k : T.solution(N, arr)) {
            sb.append(k[0]).append(' ').append(k[1]).append('\n');
        }
        System.out.println(sb);
    }
}
