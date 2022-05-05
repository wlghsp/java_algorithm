package leetcode.finished;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx1 {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{5, 40}, {3, 50}, {1, 30}, {4, 20}, {2, 10}};

        // 1. Comparator 익명 클래스 구현
        Arrays.sort(arr, (o1, o2) -> o2[1] - o1[1]);

        System.out.println(Arrays.deepToString(arr));

        // 다중 조건
        Arrays.sort(arr, (o1, o2) -> o1[0]!=o2[0] ? o1[0]-o2[0] : o1[1] - o2[1]);
        System.out.println(Arrays.deepToString(arr));


        Arrays.sort(arr, Comparator.comparingInt((int[] o) -> o[1]).reversed());
    }
}

