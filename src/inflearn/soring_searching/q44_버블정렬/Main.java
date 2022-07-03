package inflearn.soring_searching.q44_버블정렬;

import java.util.Scanner;

public class Main {
      /*
         버블정렬은 두 개의 인접한 원소를 비교하여 정렬하는 방식
         데이터를 비교하면서 찾기 때문에 비교 정렬, 제자리 정렬
         앞에서부터 차례로 비교하기 때문에 안정 정렬

        안정 정렬: 중복된 값을 입력 순서와 동일하게 정렬하는 정렬 알고리즘, 삽입, 병합, 버블
        불안 정렬: 중복된 값이 입력 순서와 동일하지 않게 정렬되는 알고리즘, 퀵, 선택, 계수


         */
    private int[] solution(int[] arr) {
        // round는 배열 크기 -1 만큼 진행됨
        for (int i = 1; i < arr.length; i++) {

            // 각 라운드별 비교횟수는 배열 크기의 현재 라운드를 뺀 만큼 비교함
            for (int j = 0; j < arr.length - i; j++) {

                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        return arr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i : T.solution(arr)) {
            System.out.print(i + " ");
        }

    }
}
