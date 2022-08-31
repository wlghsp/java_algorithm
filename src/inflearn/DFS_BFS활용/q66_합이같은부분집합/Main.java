package inflearn.DFS_BFS활용.q66_합이같은부분집합;

import java.util.Scanner;

public class Main {
    // 부분집합 문제
    static String answer = "NO";
    static int n, total = 0;
    boolean flag = false;

    public void DFS(int L, int sum, int[] arr) { // DFS(L, sum, arr) 로 재귀함수
        if (flag) return;
        if (sum > total/2) return; // 부분합이 전체 총합의 절반보다 크면 종료
        if (L == n) {
            if ((total - sum) == sum) { // 총합에서 부분합을 뺀 값이 부분합과 같다면 부분집합의 원소의 합이 서로 같은 경우가 존재함.
                answer = "YES";
                flag = true; // flag가 true로 위의 if문에서 모두 return으로 종료시킴
            }
        } else {
            DFS(L + 1, sum + arr[L], arr); // 부분집합에 arr[L]의 숫자를 사용
            DFS(L + 1, sum, arr); // arr[L]의 숫자를 사용하지 않음
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // 배열에 숫자들을 저장
            total += arr[i];       // 숫자들의 합을 구해놓는다.
        }

        T.DFS(0, 0, arr);
        System.out.println(answer);

    }
}
