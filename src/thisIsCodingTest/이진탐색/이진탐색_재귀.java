package thisIsCodingTest.이진탐색;

import java.util.Scanner;

public class 이진탐색_재귀 {
    /*
10 7
1 3 5 7 9 11 13 15 17 19
     */
    // 이진탐색 소스코드 구현(재귀)
    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) return -1; // 다 돌았는데 못 찾았음
        int mid = (start + end) / 2;
        // 찾은 경우 중간점 인덱스 반환
        if (arr[mid] == target) return mid;
        else if (arr[mid] > target)
            return binarySearch(arr, target, start, mid - 1);
        else return binarySearch(arr, target, mid + 1, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = binarySearch(arr, target, 0, n - 1);
        if (result == -1) System.out.println("원소가 존재하지 않습니다.");
        else System.out.println(result + 1);

    }
}
