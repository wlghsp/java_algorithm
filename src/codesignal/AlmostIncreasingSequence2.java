package codesignal;


/*
Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.

Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. Sequence containing only one element is also considered to be strictly increasing.

Example

    For sequence = [1, 3, 2, 1], the output should be
    solution(sequence) = false.

    There is no one element in this array that can be removed in order to get a strictly increasing sequence.

    For sequence = [1, 3, 2], the output should be
    solution(sequence) = true.

    You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].

Input/Output

    [execution time limit] 3 seconds (java)

    [input] array.integer sequence

    Guaranteed constraints:
    2 ≤ sequence.length ≤ 105,
    -105 ≤ sequence[i] ≤ 105.

    [output] boolean

    Return true if it is possible to remove one element from the array in order to get a strictly increasing sequence, otherwise return false.


 */

import java.util.ArrayList;
import java.util.Arrays;

public class AlmostIncreasingSequence2 {

    static boolean solution(int[] arr) { // 요소를 1개 삭제하고 가능한지 판단하는 문제로, 삭제할 필요가 있을때마다 count 증가
        int count = 0;
        int size = arr.length;
        if (size == 1) return true;
        for (int i = 0; i < size-1; i++) {
            if (arr[i]>= arr[i+1]) { // 뒷 숫자가 앞 요소보다 작은 경우
                count++; // 요소 한 개 삭제
                if (i > 0 && (i+2) < size && arr[i-1] >= arr[i+1] && arr[i] >= arr[i+2]) { // 증가하는 배열로 만들 수 없는 경우임.
                    count++;
                }
            }
        }

        return count<=1;
    }

    static boolean solution1(int[] arr) {
        int removed = 0;

        for (int i = 0; i < arr.length -2 && removed <= 2; i++) {
            int a = arr[i]; //1
            int b = arr[i+1]; // 3
            int c = arr[i+2]; // 2

            if (a >= b) {
                removed++;
                arr[i] = b - 1;
            }

            if (b >= c) {
                removed++; // removed +1
                if (a == c) {
                    arr[i + 2] = b + 1;
                } else {
                    arr[i + 1] = a; // a1, a1, c
                }
            }
        }

        return removed <= 1;
    }





    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,2}));
    }
}
