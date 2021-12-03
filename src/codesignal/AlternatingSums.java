package codesignal;


/*
Several people are standing in a row and need to be divided into two teams. 
The first person goes into team 1, the second goes into team 2, the third goes into team 1 again, the fourth into team 2, and so on.
You are given an array of positive integers - the weights of the people. 
Return an array of two integers, where the first element is the total weight of team 1, and the second element is the total weight of team 2 after the division is complete.

Example

For a = [50, 60, 60, 45, 70], the output should be
solution(a) = [180, 105].

Input/Output

    [execution time limit] 3 seconds (java)

    [input] array.integer a

    Guaranteed constraints:
    1 ≤ a.length ≤ 105,
    45 ≤ a[i] ≤ 100.

    [output] array.integer


*/

import java.util.Arrays;

public class AlternatingSums {

    // 베스트 자바 풀이
    static int[] solution(int[] a) {
      int[] niz = new int[2];

        for (int i = 0; i < a.length; i++) {
            niz[i%2] += a[i]; // if else 사용 없이 홀수 짝수 인덱스로 나뉨 
        }

        return niz;
    }

    static int[] solution1(int[] a) {
        int first = 0, second = 0;

        for (int i = 0; i < a.length; i++) {
            if (i%2 == 0) {
                first += a[i];
            } else {
                second += a[i];
            }
        }

        return new int[]{first, second};
    }
    



    public static void main(String[] args) {
        int[] a = {50, 60, 60, 45, 70};
        System.out.println(Arrays.toString(solution(a)));

    }    
}
