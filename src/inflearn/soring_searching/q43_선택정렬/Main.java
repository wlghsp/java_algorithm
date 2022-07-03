package inflearn.soring_searching.q43_선택정렬;

import java.util.Scanner;

public class Main {

      /*
         선택정렬은 말 그대로 현재 위치에 들어갈 데이터를 찾아 선택하는 알고리즘
         데이터를 비교하면서 찾기 때문에 비교 정렬이며 정렬의 대상이 되는 데이터 외에 추가적인 공간을 필요로 하지 않기 때문에
         제자리 정렬이기도 하다. 정확히는 데이터를 서로 교환하는 과정에서 임시 변수를 필요로 하나, 이는 충분히 무시할 만큼 적은 양이기 때문에
         제자리 정렬로 보는 것이다. 그리고 불안정 정렬이다.

         1. 앞에서부터 현재 원소와 바로 다음의 원소를 비교한다.
         2. 현재 원소가 다음 원소보다 크면 원소를 교환한다.
         3. 다음 원소로 이동하여 해당 원소와 그 다음원소를 비교한다.
         */

    private int[] solution(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;

            // 최솟값을 찾고 있는 인덱스 찾기, j = i + 1에서 시작 i의 뒤에서부터 돈다.
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            // i번째 값과 찾은 최솟값을 서로 교환
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
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
