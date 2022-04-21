package inflearn.q25_두배열합치기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

    // 투포인터 알고리즘을 사용해야 빠름.
    // Arrays.sort() 퀵정렬 O(nlogn)임. 이를 O(n)으로 해결하세요.
    // 2개의 포인터를 증가시키면서 작은 값을 answer에 넣어주고,
    // 한쪽 배열 원소를 다 채웠다면 다른 배열 원소를 채우기 위해
    // while 문을 둘다 돌려서 남은 원소를 넣어준다.
    private ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m){
            if (a[p1] < b[p2]) {
                answer.add(a[p1++]);
            } else {
                answer.add(a[p2++]);
            }
        }
        // 어느 쪽이 남은지 알 수 없으므로 둘 다 해봐야 함.
        while(p1 < n) answer.add(a[p1++]);
        while(p2 < m) answer.add(b[p2++]);

        return answer;
    }


    public static void main(String[] args) {
        Main2 T = new Main2();
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
