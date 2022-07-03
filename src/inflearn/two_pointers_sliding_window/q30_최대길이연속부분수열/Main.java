package inflearn.two_pointers_sliding_window.q30_최대길이연속부분수열;

import java.util.Scanner;

public class Main {

    public int solution(int n, int k, int[] arr) {
        int answer = 0, cnt =0, lt = 0;

        for (int rt = 0; rt < arr.length; rt++) {
            if (arr[rt] == 0) cnt++; // 0이면 바꿔야하므로 카운트
            while (cnt > k) {  // 카운트된 횟수가 k를 넘을때는
                if (arr[lt] == 0) cnt--; // lt인덱스에 0이라면 cnt를 감소
                lt++; // 범위를 좁히기 위해 lt는 증가시켜준다.
            }
            answer = Math.max(answer, rt - lt + 1); // rt에서 lt의 거리= rt-lt+1, 둘을 비교해서 최댓값을 반환한다.
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n, k, arr));

    }
}
