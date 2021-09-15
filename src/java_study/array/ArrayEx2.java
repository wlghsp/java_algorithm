package java_study.array;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        // 크기 할당 & 초기화 없이 배열 참조변수만 선언
        int[] arr;
        int arr1[];

        // 선언과 동시에 배열 크기 할당
        int[] arr2 = new int[5];
        String[] arr3 = new String[5];

        // 기존 배열의 참조 변수에 초기화 할당하기
        int[] arr4;
        arr4 = new int[5]; // 5의 크기를 가지고 초기값 0으로 채워진 배열 생성
        System.out.println(Arrays.toString(arr4));

        // 선언과 동시에 배열의 크기 지정 및 값 초기화
        int[] arr5 = {1,2,3,4,5};
        int[] arr6 = new int[] {1,2,3,4,5};
        int[] odds = {1,3,5,7,9};
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};

        // 2차원 배열 선언
        int[][] arr7 = new int[4][3];  // 3의 크기의 배열을 4개 가질 수 있는 2차원 배열 할당
        int[][] arr8 = { {2,5,3}, {4,4,1} , {1,7,3} , {3,4,5}};

        // 2차원 배열 출력하기
        // 1. 반복문 이용하기
//        for (int i = 0; i < arr8.length; i++) {
//            int[] inArr = arr8[i];
//            for (int j = 0; j < inArr.length; j++) {
//                System.out.print(inArr[j] + " ");
//            }
//            System.out.println();
//        }

        // 2.  java.util.Arrays.deepToString() 이용하기
        System.out.println(Arrays.deepToString(arr8));
    }
}
