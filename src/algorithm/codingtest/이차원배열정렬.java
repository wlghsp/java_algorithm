package algorithm.codingtest;

import java.util.Arrays;
import java.util.Comparator;

public class 이차원배열정렬 {
    public static void main(String[] args) {
            int[][] arr = { {3, 5}, {3,2} , {4, 4}};
            Arrays.sort(arr, new Comparator<int []>() {

                @Override
                public int compare(int[] o1, int[] o2) {
                    if (o1[0] == o2[0]) { // 2차원 배열의 첫번째 값이 같다면 두번째 값으로 비교 함. 
                        return o1[1] - o2[1];
                    } else {                // 첫번째 값이 다르므로 두 수 간의 비교 
                        return o1[0] - o2[0];
                    }           
                }
            });

            System.out.println(Arrays.deepToString(arr));
    }
}
