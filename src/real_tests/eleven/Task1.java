package real_tests.eleven;

import java.util.Collections;
import java.util.PriorityQueue;

/*

제일 큰 홀수 와 제일 큰 짝수의 합을 반환하시오. ;

짝수나 홀수가 없으면 0으로 간주하고 합을 반환한다. 

*/

public class Task1 {
    public int solution(int[] A) {
        PriorityQueue<Integer> evenQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> oddQ = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                evenQ.offer(A[i]);
            } else {
                oddQ.offer(A[i]);
            }
        }
        int evenMax = 0;
        int oddMax = 0;
        if (evenQ.size() > 0) {
            evenMax = evenQ.poll();
        }
        if (oddQ.size() > 0) {
            oddMax = oddQ.poll();
        }
        return evenMax + oddMax;
    }

    public static void main(String[] args) {
        Task1 sol = new Task1();
        int[] array1 = new int[] { 5, 3, 10, 6, 11 };
        int[] array2 = new int[] { 7, 3, 15, 11 };
        int[] array3 = new int[] { 2, 6, 4, 6 };
        System.out.println(sol.solution(array1));
        System.out.println(sol.solution(array2));
        System.out.println(sol.solution(array3));

    }

}