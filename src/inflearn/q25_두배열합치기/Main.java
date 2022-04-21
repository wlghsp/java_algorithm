package inflearn.q25_두배열합치기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // 내 풀이
    private int[] solution(int n, int m, int[] nArr, int[] mArr) {
        int[] answer = new int[n+m];

        for (int i = 0; i < n; i++) {
            answer[i] = nArr[i];
        }
        for (int i = 0; i < m; i++) {
            answer[n+i] = mArr[i];
        }

        Arrays.sort(answer);

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] mArr = new int[m];
        for (int i = 0; i < m; i++) {
            mArr[i] = sc.nextInt();
        }

        for (int i : T.solution(n,m,nArr, mArr)) {
            System.out.print(i + " ");
        }
    }
}
