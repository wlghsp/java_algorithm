package codesignal;

/*
Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an non-negative integer size.
Since he likes to make things perfect,
he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one exactly by 1.
He may need some additional statues to be able to accomplish that. Help him figure out the minimum number of additional statues needed.

Example

For statues = [6, 2, 3, 8], the output should be
solution(statues) = 3.

Ratiorg needs statues of sizes 4, 5 and 7.

Input/Output

    [execution time limit] 3 seconds (java)

    [input] array.integer statues

    An array of distinct non-negative integers.

    Guaranteed constraints:
    1 ≤ statues.length ≤ 10, // 사이즈는 1~10까지
    0 ≤ statues[i] ≤ 20. // 0 ~ 20개까지

    [output] integer

    The minimal number of statues that need to be added to existing statues such that it contains every integer size from an interval [L, R] (for some L, R) and no other sizes.



 */


import java.util.Arrays;

public class MakeArrayConsecutive2 {

    static int solution(int[] arr) {
        int cnt = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1] - arr[i] != 1) {
               cnt += arr[i+1] - arr[i] - 1;
            }
        }
        return cnt;
    }


    public static void main(String[] args) {
        int[] arr = {6, 2, 3, 8};
        System.out.println(solution(arr));
    }
}
