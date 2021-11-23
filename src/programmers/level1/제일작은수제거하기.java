package programmers.level1;

import java.util.ArrayList;

/*
정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
제한 조건

    arr은 길이 1 이상인 배열입니다.
    인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.

입출력 예
arr 	return
[4,3,2,1] 	[4,3,2]
[10] 	[-1]

*/


import java.util.Arrays;

public class 제일작은수제거하기 {
    
    // 처음에 내림차순 정렬 해서 풀다가 테스트에서 전부 오답나옴. 
    // 최소값만 제거된 상태로 반환하는 것임. 
    // 최소값을 찾고 이를 빼고 전달하자. 
    static int[] solution(int[] arr) {
        if (arr.length <= 1) {
            int[] arr2 = {-1};
            return arr2;
        }
        int min = arr[0];
        int[] answer = new int[arr.length -1];
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        } // 최소값 구하기 

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) continue;
            else {
                answer[index++] = arr[i];
            }
        }

        return answer;
    }
    
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int[] arr1 = {10};
        System.out.println(Arrays.toString(solution(arr)));
        System.out.println(Arrays.toString(solution(arr1)));
    }
}
