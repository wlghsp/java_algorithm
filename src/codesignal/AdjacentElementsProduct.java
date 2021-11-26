package codesignal;

/*
Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
solution(inputArray) = 21.

7 and 3 produce the largest product.

Input/Output

    [execution time limit] 3 seconds (java)

    [input] array.integer inputArray

    An array of integers containing at least two elements.

    Guaranteed constraints:
    2 ≤ inputArray.length ≤ 10,
    -1000 ≤ inputArray[i] ≤ 1000.

    [output] integer

    The largest product of adjacent elements.

[-1, -2]

2

[-23, 4, -3, 8, -12]

-12


 */


public class AdjacentElementsProduct {

    static int[] result = new int[11];

    static int solution(int[] arr) {
        int max = Integer.MIN_VALUE;
        if (arr.length == 2) {
            return arr[0] * arr[1];
        } else {
            for (int i = 1; i < arr.length - 1; i++) {
                int prev = arr[i - 1] * arr[i];
                int after = arr[i + 1] * arr[i];
                int bigger = Math.max(prev, after);
                max = Math.max(max, bigger);
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-1, -2};
        System.out.println(solution(arr));

    }
}
