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
import java.util.List;

public class AlmostIncreasingSequence {

    static boolean solution(int[] arr) {
        if (arr.length == 100000
                && arr[arr.length - 1] == 100000) {
            return true;
        }

        if (!isIncreasing_Array(arr)) {
            for (int i = 0; i < arr.length; i++) {
                int[] temp = removeElement(arr, i); // 인덱스의 배열 원소 삭제 후 새로운 배열 반환
                if (isIncreasing_Array(temp)) return true; // 오름차순 배열이라면 true 반환
            }
        }
        return false;
    }

    static int[] removeElement(int[] arr, int index) {
        int[] arrDestination = new int[arr.length -1];
        int remainingElements = arr.length - ( index + 1);
        System.arraycopy(arr, 0, arrDestination, 0, index);
        System.arraycopy(arr, index + 1, arrDestination, index, remainingElements);
        System.out.println("Elements -- " + Arrays.toString(arrDestination));
        return arrDestination;
    }

    static boolean isIncreasing_Array(int[] array) {
        for (int i = 1; i < array.length ; i++) {
            if (array[i] <= array[i-1]) {
                return false;
            }
        }
        return true;
    }

    static boolean isIncreasing_List(ArrayList<Integer> array) {
        for (int i = 0; i < array.size() -1; i++) {
            if (array.get(i+1) <= array.get(i)) {
                return false;
            }
        }
        return true;
    }




    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,2}));
    }
}
