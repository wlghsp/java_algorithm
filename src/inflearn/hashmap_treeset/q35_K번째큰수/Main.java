package inflearn.hashmap_treeset.q35_K번째큰수;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public int solution(int N, int K, int[] arr) {
        int answer = -1;
        // TreeSet 중복없는 숫자의 정렬, Collections.reverseOrder()를 통해 내림차순 정렬
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        // 3장을 뽑을 수 있는 모든 경우, 3중 포문
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int l = j+1; l < N; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int idx = 1;
        for (Integer x : Tset) {
            if (idx == K) {
                return x;
            }
            idx++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(N, K, arr));
    }
}
