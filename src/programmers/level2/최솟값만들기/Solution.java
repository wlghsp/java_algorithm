package programmers.level2.최솟값만들기;

public class Solution {

    public int solution(int[] A, int[] B) {
        int answer = 0;
        quickSort(A, 0, A.length - 1);
        quickSort(B, 0, B.length - 1);
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - 1 - i];
        }
        return answer;
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return; // 원소가 1개인 경우 종료
        int pivot = start; // 피벗은 첫 번째 원소
        int left = start + 1;
        int right = end;

        while (left <= right) {
            // 피벗보다 큰 데이터를 찾을 때까지 반복
            while (left <= end && arr[left] <= arr[pivot]) left++;
            // 피벗보다 작은 데이터를 찾을 때까지 반복
            while (right > start && arr[right] >= arr[pivot]) right--;

            // 엇갈렸다면 작은 데이터와 피벗을 교체
            if (left > right) {
                swap(arr, pivot, right);
            }
            // 엇갈리지 않았다면 작은 데이터와 큰 데이터를 교체
            else {
                swap(arr, left, right);
            }
        }
        // 분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
        quickSort(arr, start, right - 1);
        quickSort(arr, right + 1, end);

    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
