package inflearn.q23_임시반장정하기;

import java.util.Scanner;

public class Main {
    // 3 중 포문 사용
    // n = 5
    // for i 학생 1~5,
    //      for j 학생, 1~5
    //          for k 학년, 무조건 1~5
    //              if  a[i][k] == a[j][k]
    //                      cnt++;
    // i, j가 같으면 자기자신과의 비교이지만 어차피 가장 많이 겹치는 학생을 찾는 것이므로 다 같은 조건으로 i!=j 이렇게 거를 필요 없음.
    // 학생을 카운팅할 때 한 번만 카운팅하도록 break를 걸어준다.


    public int solution(int n, int[][] arr) {
        int stdNum = 0; // 학생 번호
        int max = Integer.MIN_VALUE;


        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                stdNum = i;
            }
        }
        return stdNum;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
