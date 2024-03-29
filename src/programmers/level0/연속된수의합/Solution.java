package programmers.level0.연속된수의합;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int middleNumber = total / num;
        int subtractNumber = total % num == 0 ? num / 2 : num / 2 - 1;

        int startNumber = middleNumber - subtractNumber;

        for (int i = 0; i < num; i++) {
            answer[i] = startNumber + i;
        }
        return answer;
    }



    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(3, 12))); // [3, 4, 5]
        System.out.println(Arrays.toString(s.solution(5, 15))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(s.solution(4, 14))); // [2, 3, 4, 5]
        System.out.println(Arrays.toString(s.solution(5, 5)));  // [-1, 0, 1, 2, 3]
    }
}
