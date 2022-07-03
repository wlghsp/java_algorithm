package inflearn.two_pointers_sliding_window.q26_공통원소구하기;

import java.util.*;

public class Main {

    private ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        // 정렬을 해줘야 함.
        Arrays.sort(a);
        Arrays.sort(b);

        // 투포인터
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m){
            if (a[p1] < b[p2]) p1++; // 작은 쪽의 포인터를 증가시킴
            else if (a[p1] > b[p2]) p2++;
            else if (a[p1] == b[p2]) {
                answer.add(a[p1++]);
                p2++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        for (Integer i : T.solution(n,m,a,b)) {
            System.out.print(i + " ");
        }
    }
}
