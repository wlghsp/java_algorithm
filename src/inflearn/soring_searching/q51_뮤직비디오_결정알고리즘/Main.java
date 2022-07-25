package inflearn.soring_searching.q51_뮤직비디오_결정알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int count(int[] arr, int capacity) {
        int cnt = 1, sum = 0;
        for (int x : arr) {
            if (sum + x > capacity) { //sum + x가 용량을 넘는다면
                cnt++; // 새로운 DVD 장이 필요함
                sum = x; // x부터 시작
            } else sum += x;
        }

        return cnt;
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        // 배열에서 스트림으로 최댓값 구함. getAsint()를 붙여줘야함.

        // 범위는 배열의 최댓값에서 배열 전체 합까지임.
        // 최솟값은 min()
        int lt = Arrays.stream(arr).max().getAsInt();
        // sum()은 int나 long을 반환함
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2; // DVD 한 장의 용량
            if (count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else lt = mid + 1;

        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// 곡의 수
        int m = sc.nextInt(); // DVD 갯수
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }

}
